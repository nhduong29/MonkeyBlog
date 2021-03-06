package com.nhduong.monkeyblog.model;
// Generated May 23, 2017 10:37:10 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * BlogUser generated by hbm2java
 */
@Entity
@Table(name = "blog_user", catalog = "monkeyblog", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class BlogUser implements java.io.Serializable {

	private int id;
	private String name;
	private String email;
	private String website;
	private Set<BlogComment> blogComments = new HashSet<BlogComment>(0);

	public BlogUser() {
	}

	public BlogUser(int id) {
		this.id = id;
	}

	public BlogUser(int id, String name, String email, String website, Set<BlogComment> blogComments) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.website = website;
		this.blogComments = blogComments;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", unique = true, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "website", length = 45)
	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "blogUser")
	public Set<BlogComment> getBlogComments() {
		return this.blogComments;
	}

	public void setBlogComments(Set<BlogComment> blogComments) {
		this.blogComments = blogComments;
	}

}
