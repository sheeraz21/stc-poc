<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="apple-touch-icon" sizes="76x76" href="../img/apple-icon.png">
<link rel="icon" type="image/png" sizes="96x96" href="../img/favicon.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>Login</title>
<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
<meta name="viewport" content="width=device-width" />


<%-- <s:if test="hasActionErrors()">
<script type="text/javascript" src="../js/bootstrap-checkbox-radio.js"></script>
<script type="text/javascript" src="../js/bootstrap-notify.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/chartist.min.js"></script>
<script type="text/javascript" src="../js/demo.js"></script>
<script type="text/javascript" src="../js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="../js/paper-dashboard.js"></script>
<script type="text/javascript" src="../js/highchart.js"></script>
<link rel="stylesheet" type="text/css" href="../css/animate.min.css"> 
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">  
<link rel="stylesheet" type="text/css" href="../css/demo.css">  
<link rel="stylesheet" type="text/css" href="../css/animate.min.css">  
<link rel="stylesheet" type="text/css" href="../css/paper-dashboard.css">  
<link rel="stylesheet" type="text/css" href="../css/themify-icons.css">  
</s:if> --%>
<%-- <s:else>

</s:else>
<style type="text/css">
.errorMessage {
	color:red;

}

</style> --%>
<s:include value="/pages/script.jsp"></s:include> 
</head>
<body>
	<div class="wrapper">
		<div class="main-panel">
			<div class="container-fluid">
				<div class="content">
					<div class="container-fluid">
						<div class="row">
							<div class="col-lg-8 col-md-7">
								<div class="card">
									<div class="header">
										<h4 class="title">Sign In</h4>
									</div>
									<div class="content">
									<s:actionerror/>
										<s:form action="login" theme="simple">
														<s:textfield name="employeeUIBean.userName" cssClass="form-control border-input"
															value="%{employee.userName}" placeholder="User Name" ></s:textfield>&nbsp;&nbsp;&nbsp;
														<s:password name="employeeUIBean.password" cssClass="form-control border-input"
															value="%{employee.password}" placeholder="Password"/>&nbsp;&nbsp;
											 <div class="text-center">&nbsp;&nbsp;
												<s:submit cssClass="btn btn-info btn-fill btn-wd"  id="btnSubmit" value="Sign In"></s:submit>&nbsp;&nbsp;
											 </div> 




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