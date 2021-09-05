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
${product.category_id}
<br>
<br>
<c:forEach var="item" items ="${list }">
${item.category.id}
<br>
</c:forEach>
</body>
</html>