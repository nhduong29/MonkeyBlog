package com.nhduong.monkeyblog.model;
// Generated May 23, 2017 10:37:10 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * BlogRelated generated by hbm2java
 */
@Entity
@Table(name = "blog_related", catalog = "monkeyblog")
public class BlogRelated implements java.io.Serializable {

	private BlogRelatedId id;
	private BlogPost blogPost;

	public BlogRelated() {
	}

	public BlogRelated(BlogRelatedId id, BlogPost blogPost) {
		this.id = id;
		this.blogPost = blogPost;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "blogPostId", column = @Column(name = "blog_post_id", nullable = false)),
			@AttributeOverride(name = "blogRelatedPostId", column = @Column(name = "blog_related_post_id", nullable = false)) })
	public BlogRelatedId getId() {
		return this.id;
	}

	public void setId(BlogRelatedId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "blog_post_id", nullable = false, insertable = false, updatable = false)
	public BlogPost getBlogPost() {
		return this.blogPost;
	}

	public void setBlogPost(BlogPost blogPost) {
		this.blogPost = blogPost;
	}

}
