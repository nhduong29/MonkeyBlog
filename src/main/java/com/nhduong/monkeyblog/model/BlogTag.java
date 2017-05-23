package com.nhduong.monkeyblog.model;
// Generated May 23, 2017 10:37:10 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BlogTag generated by hbm2java
 */
@Entity
@Table(name = "blog_tag", catalog = "monkeyblog")
public class BlogTag implements java.io.Serializable {

	private int id;
	private BlogPost blogPost;
	private String tag;
	private String tagClean;

	public BlogTag() {
	}

	public BlogTag(int id, BlogPost blogPost, String tag, String tagClean) {
		this.id = id;
		this.blogPost = blogPost;
		this.tag = tag;
		this.tagClean = tagClean;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id", nullable = false)
	public BlogPost getBlogPost() {
		return this.blogPost;
	}

	public void setBlogPost(BlogPost blogPost) {
		this.blogPost = blogPost;
	}

	@Column(name = "tag", nullable = false, length = 45)
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name = "tag_clean", nullable = false, length = 45)
	public String getTagClean() {
		return this.tagClean;
	}

	public void setTagClean(String tagClean) {
		this.tagClean = tagClean;
	}

}
