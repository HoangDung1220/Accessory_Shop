package com.laptrinhjavaweb.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
	
	@EntityGraph(value ="Product.Colors")
	public List<ProductEntity> findAll();
	
	@Query(value="select *from product where product.new_product=?1 order by rand() limit 9", nativeQuery=true)
	public List<ProductEntity> findByNewProduct(boolean isNew);
	
	@Query(value="select *from product where product.high_light=?1 order by rand() limit 9", nativeQuery=true)
	public List<ProductEntity> findByHightLight(boolean isHighLight);
	
	@Query(value="select *from product left join color on product.id = color.product_id where product.category_id=?1 ", nativeQuery=true)
	public List<ProductEntity> findByCategoryId(int category_id);
	
	@Query(value="select *from product left join color on product.id = color.product_id where product.category_id=?1 ORDER BY ?#{#pageable} ",
			countQuery = "select count(*) from product left join color on product.id = color.product_id where product.category_id=?1",
			nativeQuery=true)
	public Page<ProductEntity> findByCategoryIdPageable(int category_id,Pageable pageable);
	
	
}
