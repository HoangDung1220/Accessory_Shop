package com.laptrinhjavaweb.dto;

public class SlideDTO {
	private int id;
	private String content;
	private String caption;
	private String img;
	
	public SlideDTO(int id, String content, String caption, String img) {
		super();
		this.id = id;
		this.content = content;
		this.caption = caption;
		this.img = img;
	}
	
	

	public SlideDTO() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}
