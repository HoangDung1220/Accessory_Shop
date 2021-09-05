<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<div class="row">
<div class="span9">
    <ul class="breadcrumb">
		<li><a href="index.html">Home</a> <span class="divider">/</span></li>
		<li class="active">Login</li>
    </ul>
	<h3> Login</h3>	
	<hr class="soft"/>
	
	<div class="row">
		<div class="span4">
			<div class="well">
			<h5>CREATE YOUR ACCOUNT</h5><br/>
			
			<form:form action="Register" method="POST" modelAttribute="user">
				  <div class="control-group">
				<label class="control-label" for="inputEmail">E-mail address</label>
				<div class="controls">
				  <form:input  class="span3"  type="email" placeholder="Enter Email" path="user"/>
				</div>
				</div>
				
				 <div class="control-group">
				<label class="control-label" for="inputPassword">Password</label>
				<div class="controls">
				  <form:input  class="span3"  type="password" placeholder="Enter Password" path="password"/>
				</div>
				</div>
				
				 <div class="control-group">
				<label class="control-label" for="inputFullname">Fullname</label>
				<div class="controls">
				  <form:input  class="span3"  type="text" placeholder="Enter Fullname" path="display_name"/>
				</div>
				</div>
				
				 <div class="control-group">
				<label class="control-label" for="inputAddress">Address</label>
				<div class="controls">
				</div>
								  <form:input  class="span3"  type="text" placeholder="Enter Address" path="address"/>
				
				</div>
				
				
			  <div class="controls">
			  <button type="submit" class="btn block">Create Your Account</button>
			  </div>
			  
			  
			</form:form>
		</div>
		</div>
		
		
		
		<div class="span1"> &nbsp;</div>
		<div class="span4">
			<div class="well">
			<h5>ALREADY REGISTERED ?</h5>
			<h6>${status }</h6>
			<form:form action="login" method="POST" modelAttribute="user">
			  <div class="control-group">
				<label class="control-label" for="inputEmail">Enter Email</label>
				<div class="controls">
				  <form:input class="span3"  type="text" placeholder="Email" path="user"/>
				</div>
			  </div>
			  <div class="control-group">
				<label class="control-label" for="inputPassword">Enter Password</label>
				<div class="controls">
				  <form:input type="password" class="span3" placeholder="Password" path ="password"/>
				</div>
			  </div>
			  <div class="control-group">
				<div class="controls">
				  <button type="submit" class="defaultBtn">Sign in</button> <a href="#">Forget password?</a>
				</div>
			  </div>
		</form:form>
		</div>
		</div>
	</div>	
	
</div>
</div>

</body>
</html>