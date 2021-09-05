<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bill</title>
</head>
<body>
<h5>${model.name }</h5>
<div class="well">
	<form:form  class="form-horizontal" action="Bill" method="POST" modelAttribute="bills" >
		<h3>Your Billing Details</h3>
		<div class="control-group">
			<label class="control-label"> User <sup>*</sup></label>
			<div class="controls">
			  <form:input type="text" placeholder=" Enter user" path="user"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">Phone <sup>*</sup></label>
			<div class="controls">
			  <form:input type="text" placeholder="Enter phone" path="phone" />
			</div>
		</div>
		 <div class="control-group">
			<label class="control-label">Fullname <sup>*</sup></label>
			<div class="controls">
			  <form:input type="text" placeholder=" Enter name" path="display_name"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">Address <sup>*</sup></label>
			<div class="controls">
			<form:textarea path="address"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">Note <sup>*</sup></label>
			<div class="controls">
			<form:textarea path="note"/>
			</div>
		</div>
	<div class="control-group">
		<div class="controls">
		 <input type="submit" name="submitAccount" value="Register" class="shopBtn exclusive">
		</div>
	</div>
	</form:form>
</div>
</body>
</html>