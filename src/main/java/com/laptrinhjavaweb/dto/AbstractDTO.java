package com.laptrinhjavaweb.dto;

import java.util.ArrayList;
import java.util.List;

public class AbstractDTO<T> {
	private List<T> listResult = new ArrayList<T>();
	private Integer page;
	private Integer limit;
	private Integer totalPage;
	private Integer totalItem;
	
	public AbstractDTO() {
		super();
	}

	public AbstractDTO(List<T> listResult, Integer page, Integer limit, Integer totalPage, Integer totalItem) {
		super();
		this.listResult = listResult;
		this.page = page;
		this.limit = limit;
		this.totalPage = totalPage;
		this.totalItem = totalItem;
	}

	public List<T> getListResult() {
		return listResult;
	}

	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(Integer totalItem) {
		this.totalItem = totalItem;
	}
	
	
	
}
