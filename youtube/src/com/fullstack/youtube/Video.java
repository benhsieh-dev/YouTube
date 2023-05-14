package com.fullstack.youtube;

public class Video {
	
	private int id;
	private String category;
	private String src;
	
	public Video(int id, String category, String src) {
		this.id = id;
		this.category = category;
		this.src = src;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	} 
	
	
	

}
