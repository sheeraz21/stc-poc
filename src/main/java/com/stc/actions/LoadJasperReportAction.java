package com.stc.actions;



import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.naming.NamingException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.result.StrutsResultSupport;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.util.JRLoader;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.util.ValueStack;


public class LoadJasperReportAction extends StrutsResultSupport {
	
    protected String parameters;
    protected String rptFormat;

	public String getRptFormat() {
		return rptFormat;
	}

	public void setRptFormat(String rptFormat) {
		this.rptFormat = rptFormat;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	@Override
    protected void doExecute(String arg0, ActionInvocation arg1)
			throws Exception {
    	try {
    		
    		String reportFileName = "JRStock";
    		String reportFormat ="";

    		Connection conn = null;
    		try {
    			try {
    			 
    				 Class.forName("com.mysql.jdbc.Driver");
    			 	} catch (ClassNotFoundException e) {
    			 		System.out.println("Please include Classpath Where your MySQL Driver is located");
    			 		e.printStackTrace(); 
    			 	}  

   			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kt","root","");

    			 
    		 if (conn != null)
    		 {
    			 System.out.println("Database Connected");
    		 }
    		 else
    		 {
    			 System.out.println(" connection Failed ");
    		 }
    			
    			
    			HttpServletRequest request = ServletActionContext.getRequest();
    			HttpServletResponse response = ServletActionContext.getResponse();
    			
    			ValueStack stack = arg1.getStack();
    			
   			   rptFormat = conditionalParse(rptFormat, arg1);
		       reportFormat=(String)stack.findValue(rptFormat);
		       
		       System.out.println("Format " + reportFormat + "  -- " + rptFormat);

   			   
   			   HashMap hmParams=(HashMap)stack.findValue(parameters);
    			
    			 parameters = conditionalParse(parameters, arg1);
    		        
       			JasperReport jasperReport = getCompiledFile(reportFileName, request);

	    		if (reportFormat.equalsIgnoreCase("html") ) {
	
	    			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hmParams, conn);
	    			generateReportHtml(jasperPrint, request, response); // For HTML report
	
	    		}
	
	    		else if  (reportFormat.equalsIgnoreCase("pdf") )  {
	
	    			generateReportPDF(response, hmParams, jasperReport, conn); // For PDF report
	
	    		    }

    		   } catch (Exception sqlExp) {

    			   System.out.println( "Exception::" + sqlExp.toString());

    		   } finally {

		    		try {
		
		    		if (conn != null) {
			    		conn.close();
			    		conn = null;
		    		}
		
		    		} catch (SQLException expSQL) {
		
		    			System.out.println("SQLExp::CLOSING::" + expSQL.toString());
		
		    		}
		
    		       }

    	

    			} catch (Exception e) {

    	            e.printStackTrace();

    			}

    }
    
    
    private JasperReport getCompiledFile(String fileName, HttpServletRequest request) throws JRException {
		File reportFile = new File( request.getSession().getServletContext().getRealPath("/jasper/" + fileName + ".jasper"));
		// If compiled file is not found, then compile XML template
		if (!reportFile.exists()) {
		           JasperCompileManager.compileReportToFile(request.getSession().getServletContext().getRealPath("/jasper/" + fileName + ".jrxml"),request.getSession().getServletContext().getRealPath("/jasper/" + fileName + ".jasper"));
		    }
	    	JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(reportFile.getPath());
		   return jasperReport;
		} 
	
    
		private void generateReportHtml( JasperPrint jasperPrint, HttpServletRequest req, HttpServletResponse resp) throws IOException, JRException {
			Map imagesMap = new HashMap();
			JRHtmlExporter exporter = new JRHtmlExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter( JRExporterParameter.OUTPUT_WRITER, resp.getWriter());
			exporter.exportReport();
		}
		

		private void generateReportPDF (HttpServletResponse resp, Map parameters, JasperReport jasperReport, Connection conn)throws JRException, NamingException, SQLException, IOException {
			byte[] bytes = null;
			bytes = JasperRunManager.runReportToPdf(jasperReport,parameters,conn);
			resp.reset();
			resp.resetBuffer();
			resp.setContentType("application/pdf");
			resp.setContentLength(bytes.length);
			ServletOutputStream ouputStream = resp.getOutputStream();
			ouputStream.write(bytes, 0, bytes.length);
			ouputStream.flush();
			ouputStream.close();
		} 

 
   


	
	
}