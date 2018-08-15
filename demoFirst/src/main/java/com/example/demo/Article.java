package com.example.demo;

import org.springframework.data.annotation.Id;

/**
 * @author heling
 *	connect to database step3: write the entity class
 *		1.@entity
 *		2.@Id
 */


public class Article {

	@Id
	String id;
	String title;
	String type;
	String publishTime;
	
	String href;
	int viewCount;
	int commentCount;
	
	public Article(String title, String type, String publishTime, String href) {
		super();
		this.title = title;
		this.type = type;
		this.publishTime = publishTime;
		this.href = href;
		this.viewCount = 0;
		this.commentCount = 0;
	}
	
	
	
	public Article(String title, String type, String publishTime, String href, int viewCount, int commentCount) {
		super();
		this.title = title;
		this.type = type;
		this.publishTime = publishTime;
		this.href = href;
		this.viewCount = viewCount;
		this.commentCount = commentCount;
	}



	public Article() { super(); }
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", type=" + type + ", publishTime=" + publishTime + ", href="
				+ href + ", viewCount=" + viewCount + ", commentCount=" + commentCount + "]";
	}
	
	
}
