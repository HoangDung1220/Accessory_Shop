<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@include file="/common/taglib.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Trang chủ"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap styles -->
    <link href="<c:url value='/template/web/css/bootstrap.css' />" rel="stylesheet"/>
    <!-- Customize styles -->
    <link href="<c:url value='/template/web/style.css'/> " rel="stylesheet"/>
    <!-- font awesome styles -->
	<link href="<c:url value='/template/web/font-awesome/css/font-awesome.css'/> " rel="stylesheet">	
	<link rel="stylesheet" href="<c:url value='/template/web/css/bootstrap.min.css' />">
	
    <link rel="shortcut icon" href="<c:url value ='/tempalte/web/ico/favicon.ico'/> ">
   
    <dec:head/>
    
    

</head>
<body>
<div class="container">
<%@ include file="/common/web/header.jsp" %>
<dec:body />
<%@ include file="/common/web/footer.jsp" %>
<div class="copyright">
<div class="container">
	<p class="pull-right">
		<a href="#"><img src="<c:url value='/template/web/img/maestro.png'/> " alt="payment"></a>
		<a href="#"><img src="<c:url value='/template/web/img/mc.png'/> " alt="payment"></a>
		<a href="#"><img src="<c:url value='/template/web/img/pp.png'/> " alt="payment"></a>
		<a href="#"><img src="<c:url value='/template/web/img/visa.png'/> " alt="payment"></a>
		<a href="#"><img src="<c:url value='/template/web/img/disc.png'/> " alt="payment"></a>
	</p>
	<span>Copyright &copy; 2013<br> bootstrap ecommerce shopping template</span>
</div>
</div>
</div>
 <script src="<c:url value='/template/web/js/jquery.js'/> "></script>
	<script src="<c:url value='/template/web/js/bootstrap.min.js'/> "></script>
	<script src="<c:url value='/template/web/js/jquery.easing-1.3.min.js'/> "></script>
    <script src="<c:url value='/template/web/js/jquery.scrollTo-1.4.3.1-min.js'/> "></script>
    <script src="<c:url value='/template/web/js/shop.js'/> "></script>
   <script src="<c:url value='https://code.jquery.com/jquery-3.3.1.min.js' />"></script>
   <script src="<c:url value='/template/paging/jquery.twbsPagination.js' />"></script>
   <dec:getProperty property="page.script"></dec:getProperty>
</body>
</html>