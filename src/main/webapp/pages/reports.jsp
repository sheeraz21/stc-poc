<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="apple-touch-icon" sizes="76x76" href="../img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="../img/favicon.png">
<title>Paper Dashboard by Creative Tim</title>

<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
 <s:include value="/pages/script.jsp"></s:include> 
<%-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<script type="text/javascript" src="../js/bootstrap-checkbox-radio.js"></script>
<script type="text/javascript" src="../js/bootstrap-notify.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/chartist.min.js"></script>
<script type="text/javascript" src="../js/demo.js"></script>
<script type="text/javascript" src="../js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="../js/paper-dashboard.js"></script>
<script type="text/javascript" src="../js/highchart.js"></script>
<script type="text/javascript" src="../js/script.js"></script>  

<link rel="stylesheet" type="text/css" href="../css/animate.min.css"> 
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">  
<link rel="stylesheet" type="text/css" href="../css/demo.css">  
<link rel="stylesheet" type="text/css" href="../css/animate.min.css">  
<link rel="stylesheet" type="text/css" href="../css/paper-dashboard.css">  
<link rel="stylesheet" type="text/css" href="../css/themify-icons.css"> 

   <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'> --%>
</head>
<body>
	<div class="wrapper">
		<div class="main-panel">
			<div class="container-fluid">
				<div class="content">
					<div class="container-fluid">
						<div class="row">
							<div class="col-lg-10 col-md-9">
								<div class="card">
									<div class="header">
										<h4 class="title">Report Geneartion</h4>
									</div>
									<div class="content">
									<s:actionerror/>
										<s:form  theme="simple"  action="jasperTest" method="post">
										<%-- <s:text name="Stock"></s:text> --%>
										<s:textfield name="qty"  label="Stock" cssClass="form-control border-input" placeholder="Enter Quantity" ></s:textfield>&nbsp;&nbsp;&nbsp;
										<fieldset>
										  <legend>Report Format</legend>
										<%-- <s:text name="Report Format"></s:text> --%>
										
										<s:radio label="format" name="rptFmt" list="#{'html':'HTML','pdf':'PDF'}" value="pdf" />&nbsp;&nbsp;
										</fieldset>
										<div class="text-center">&nbsp;&nbsp;
												<s:submit cssClass="btn btn-info btn-fill btn-wd"  id="btnSubmit" value="Generate Report"></s:submit>&nbsp;&nbsp;
										</div> 
											 
											 
											 
											 
<%-- <table id="reptbl">
<tr>
<td>
    Enter Quantity : <s:textfield name="qty"  label="Stock"/> <s:submit  value="Generate Stock Report" type="button"/>
 </td>
 <td>
 <s:radio label="format" name="rptFmt" list="#{'html':'HTML','pdf':'PDF'}" value="pdf" />
 </td>
 
</tr>
 
</table>   --%>
											 
											 
											 
											 




										</s:form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>







			</div>

		</div>
	</div>
</body>
</html>