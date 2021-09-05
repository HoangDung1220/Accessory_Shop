<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
  <head>
  
  </head>
<body>


	<div class="row">
	<div class="span12">
    <ul class="breadcrumb">
		<li><a href="index.html">Home</a> <span class="divider">/</span></li>
		<li class="active">Check Out</li>
    </ul>
	<div class="well well-small">
		<h1>Check Out <small class="pull-right">  </small></h1>
	<hr class="soften"/>	

	<table class="table table-bordered table-condensed">
              <thead>
                <tr>
                  <th>Image</th>
                  <th>Description</th>
				  <th>Color </th>
                  <th>Unit price</th>
                  <th>Quantity </th>
                  <th>Edit </th>
                  <th>Delete </th>
                  <th>Total</th>
				</tr>
              </thead>
              <tbody>
              <c:forEach var="item" items="${Cart }" varStatus="loop">
                <tr>
                   <td><img width="100"  src='<c:url value="/template/web/img/${item.value.product.img}" />' alt=""></td>
                  <td>${item.value.product.name}<br>Carate : 22<br>Model : n/a</td>
                  <td>${item.value.product.nameColor}</td>
                  <td>${item.value.product.price }</td>
                   <td>
					<input type="number"  min ="0" max="1000" class="span1" style="max-width:34px" placeholder="1" id="quantity-cart-${item.key}" size="16" type="text" value="${item.value.quantity}">
				 	
			      </td>
			     
				 <td>
	                  	<button data-id="${item.key }"  class="btn btn-mini btn-danger edit-cart" type="button">
	                  		<span class="icon-edit"></span>
						</button>
	             </td>
	                 <td>
	                  	<a href="<c:url value="/DeleteCart/${ item.key }/"/>" class="btn btn-mini btn-danger" type="button">
	                  		<span class="icon-remove"></span>
	                  	</a>
	               </td>                   
                  <td>${totalPrice }</td>
                </tr>
             </c:forEach>
				</tbody>
			
            </table><br/>
		
		
           
	<a href="products.html" class="shopBtn btn-large"><span class="icon-arrow-left"></span> Continue Shopping </a>
	<a href="<c:url value="/Bill" /> " class="shopBtn btn-large pull-right">Next <span class="icon-arrow-right"></span></a>

</div>
</div>
</div>
<content tag="script">
<script type="text/javascript">
	$(".edit-cart").on("click",function(){
		var id= $(this).data("id");
		var quantity = $("#quantity-cart-"+id).val();
		window.location = "/Accessory_Shop/UpdateCart/"+id+"/"+quantity;
	});
</script>

</content>

  </body>
</html>
