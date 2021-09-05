package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slide")
public class SlideEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="img")
	private String img;
	
	@Column(name="content")
	private String content;
	
	@Column(name="caption")
	private String caption;
	
	@Column(name="note")
	private String note;

	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public int getId() {
		return id;
	}


	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
}
