<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<s:include value="/pages/script.jsp"></s:include>
</head>
<body>
	<div class="wrapper">
		<div class="sidebar">
			<div class="sidebar-wrapper">
				<div class="logo">
					<a href="#" class="simple-text">Creative Tim</a>
				</div>
			</div>
		</div>

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
										<s:form action="login" theme="simple">
										
											 <!-- <div class="row"> -->
												
												
													<!-- <div class="form-group"> -->
													<!-- <label>User Name</label> -->
													<th><s:text name="User Name"/></th>
														<s:textfield name="" cssClass="form-control border-input"
															value="" ></s:textfield>&nbsp;
															
										
													<!-- </div> -->
													
												
											<!-- </div> -->   &nbsp;&nbsp;
											
											<!-- <div class="row"> -->
										<!-- 		<div class="col-md-2">
													<div class="form-group"> -->
													
														<s:textfield name="" cssClass="form-control border-input"
															value="" label="Password"></s:textfield>
											<!-- 		</div>
												</div> -->
											<!--  </div> --> &nbsp;&nbsp;
											<!-- <div class="text-center"> -->
												<s:submit cssClass="btn btn-info btn-fill btn-wd"></s:submit>
											<!-- </div> -->




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