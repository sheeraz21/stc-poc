package com.stc.actions;


import java.util.HashMap;
import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;

public class JasperAction extends ActionSupport {
	
	private Map<String, Object> param=null;
		
	private String qty;
	private String rptFmt;
  
	public String getRptFmt() {
		return rptFmt;
	}

	public void setRptFmt(String rptFmt) {
		this.rptFmt = rptFmt;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public Map<String, Object> getParam() {
		return param;
	}


	public void setParam(Map<String, Object> param) {
		this.param = param;
	}


	public String execute() throws Exception {
    
        try {
    		param = new HashMap<String,Object>();
    		param.put("qty", new Integer(qty));
    		param.put("Title", "Stock Details");
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
 
        return SUCCESS;
    }
 
   
}