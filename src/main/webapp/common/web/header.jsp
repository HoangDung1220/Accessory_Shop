<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Upper Header Section 
-->
<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="topNav">
		<div class="container">
			<div class="alignR">
				<div class="pull-left socialNw">
					<a href="#"><span class="icon-twitter"></span></a>
					<a href="#"><span class="icon-facebook"></span></a>
					<a href="#"><span class="icon-youtube"></span></a>
					<a href="#"><span class="icon-tumblr"></span></a>
				</div>
		
			<a class="active" href="index.html"> <span class="icon-home"></span> Home</a> 
				<a href="#"><span class="icon-user"></span> My Account</a> 
				<c:if test="${ empty userLogin }">
						<a href="<c:url value="/Register"/>"><span class="icon-edit"></span> Free Register </a> 	
				</c:if>
				<c:if test="${not empty userLogin }">
							<a href="<c:url value="/Register"/>"><span class="icon-edit"></span> ${userLogin.display_name  }</a> 	
							<a href="<c:url value="/logout"/>"><span class="icon-edit"></span> Logout</a> 	
				</c:if>
				<a href="contact.html"><span class="icon-envelope"></span> Contact us</a>
				<a href='<c:url value="/list-cart" />'><span class="icon-shopping-cart"></span> ${totalQuantity } Item(s) - <span class="badge badge-warning"> ${totalPrice }</span></a>

			</div>
		</div>
	</div>
</div>

<!--
Lower Header Section 
-->
<div class="container">
<div id="gototop"> </div>
<header id="header">
<div class="row">
	<div class="span4">
	<h1>
	<a class="logo" href="index.html"><span>Twitter Bootstrap ecommerce template</span> 
		<img src="<c:url value='template/web/img/logo-bootstrap-shoping-cart.png'/> " alt="bootstrap sexy shop">
	</a>
	</h1>
	</div>
	<div class="span4">
	<div class="offerNoteWrapper">
	<h1 class="dotmark">
	<i class="icon-cut"></i>
	Twitter Bootstrap shopping cart HTML template is available @ $14
	</h1>
	</div>
	</div>
	<div class="span4 alignR">
	<p><br> <strong> Support (24/7) :  0800 1234 678 </strong><br><br></p>
	<a href='<c:url value="/list-cart" />'> <span class="btn btn-mini">[ ${totalQuantity }] <span class="icon-shopping-cart"></span></span></a>
	<span class="btn btn-warning btn-mini">$</span>
	<span class="btn btn-mini">&pound;</span>
	<span class="btn btn-mini">&euro;</span>
	</div>
</div>
</header>

<!--
Navigation Bar Section 
-->

<div class="navbar">
	  <div class="navbar-inner">
		<div class="container">
		  <a data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		  </a>
		  <div class="nav-collapse">
		
			<ul class="nav">
				<c:forEach var="item" items="${listMenu}" varStatus="index">
				<c:if test="${index.first}">
				<li class="active"> 
				</c:if>
				<c:if test="${not index.first}">
				<li class="">
				</c:if>
				<a href="<c:url value="${item.url }" /> "> ${item.name } 	</a>
				</li>
				</c:forEach>
			 
			</ul>
			<form action="#" class="navbar-search pull-left">
			  <input type="text" placeholder="Search" class="search-query span2">
			</form>
			<c:if test="${empty userLogin }">
			<ul class="nav pull-right">
			<li class="dropdown">
			<a data-toggle="dropdown" class="dropdown-toggle" href="#"><span class="icon-lock"></span> Login <b class="caret"></b></a>
				<div class="dropdown-menu">
				<form:form  action="login" method="POST" modelAttribute="user" class="form-horizontal loginFrm">
			   <div class="control-group">
					  <input class="span2"  type="text" placeholder="Email" path="user"/>
				  </div>
				 
				 
				  <div class="control-group">
					<label class="checkbox">
					<input type="checkbox"> Remember me
					</label>
					<button type="submit" class="shopBtn btn-block">Sign in</button>
				  </div>
				</form:form>
				</div>
			</li>
			</ul>
			</c:if>
		  </div>
		</div>
	  </div>
	</div>
</div>
</body>
</html>