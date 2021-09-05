
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file ="/common/taglib.jsp" %>
<head>
<title>Sản - phẩm</title>
<style>
.pagination {
	  display: flex;
    	justify-content: center;
	}
	.pagination a {
	  color: black;
	  float: left;
	  padding: 8px 16px;
	  text-decoration: none;
	  transition: background-color .3s;
	  border: 1px solid #ddd;
	}
	.pagination a.active {
	  background-color: #4CAF50;
	  color: white;
	  border: 1px solid #4CAF50;
	}
	.pagination a:hover:not(.active) {background-color: #ddd;}
</style>
</head>
<body>
<h3>${tool }</h3>

	<div class="well well-small">
		<div class="row">
			<span style="margin-left: 25px;">Danh sách sản phẩm</span> 
			<span>${total }</span>
			<select
				class="pull-right">
				<option>A - Z</option>
				<option>Cao - Thấp</option>
			</select>
		</div>
		<c:if test="${model.listResult.size()>0 }">
		<div class="row-fluid">
		<ul class="thumbnails">
		</c:if>
		<c:forEach var ="item" items="${model.listResult}" varStatus="loop">
		<li class="span4">
					<div class="thumbnail">
						<a href="product_details.html" class="overlay"></a> <a
							class="zoomTool" href="product_details.html" title="add to cart">
							<span class="icon-search"></span> QUICK VIEW</a> 
							<a href='<c:url value="/detail/${item.id }"/>'><img width="200" src="<c:url value='/template/web/img/${item.img}'/> "> </a>
						<div class="caption cntr">
							<p>${item.name}</p>
						
							<h4>
								<a class="shopBtn" href='<c:url value="/addcart/${item.id }"/>' title="add to cart"> Add to cart
								</a>
							</h4>
							<div class="actionList">
								<a class="pull-left" href="#">Add to Wish List </a> <a
									class="pull-left" href="#"> Add to Compare </a>
							</div>
							<br class="clr">
						</div>
					</div>
				</li>
			<c:if test="${(loop.index+1)% 3==0 || (loop.index +1)== model.listResult.size() }">
			</ul>
		   </div>
		   <c:if test="${(loop.index+1)<model.listResult.size() }">
		   <div class="row-fluid">
			<ul class="thumbnails">
		   </c:if>
			</c:if>
			
		
		</c:forEach>
	
	<div class="pagination">
	<c:if test="${model.page>1}">
	 <a href='<c:url value="/san-pham/${model.category_id}/${model.page-1}/${model.limit}" />'>&laquo;</a>
	</c:if>
	<c:if test="${model.page==1 && model.listResult.size()>0}">
		 <a href='<c:url value="/san-pham/${model.category_id}/${model.page}/${model.limit}" />'>&laquo;</a>
	</c:if>
  <c:forEach var ="item" begin="${1}" end ="${model.totalPage}" varStatus="loop">
  <c:if test="${loop.index == model.page }">
    <a href='<c:url value="/san-pham/${model.category_id }/${loop.index}/${model.limit}" />' class="active">${loop.index}</a>
  </c:if>
  <c:if test="${loop.index != model.page }">
    <a href='<c:url value="/san-pham/${model.category_id }/${loop.index}/${model.limit}" />'>${loop.index}</a>
  </c:if>  
  </c:forEach>
  
  <c:if test="${model.page<model.totalPage}">
   <a href='<c:url value="/san-pham/${model.category_id}/${model.page+1}/${model.limit}"/>'>&raquo;</a>
	</c:if>
	<c:if test="${model.page==model.totalPage}">
   <a href='<c:url value="/san-pham/${model.category_id}/${model.page}/${model.limit}"/>'>&raquo;</a>
	</c:if>
</div>
	
</body>