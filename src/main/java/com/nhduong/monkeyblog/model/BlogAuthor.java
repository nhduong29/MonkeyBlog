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
 * BlogAuthor generated by hbm2java
 */
@Entity
@Table(name = "blog_author", catalog = "monkeyblog", uniqueConstraints = @UniqueConstraint(columnNames = "display_name"))
public class BlogAuthor implements java.io.Serializable {

	private int id;
	private String displayName;
	private String firstName;
	private String lastName;
	private Set<BlogPost> blogPosts = new HashSet<BlogPost>(0);

	public BlogAuthor() {
	}

	public BlogAuthor(int id, String displayName) {
		this.id = id;
		this.displayName = displayName;
	}

	public BlogAuthor(int id, String displayName, String firstName, String lastName, Set<BlogPost> blogPosts) {
		this.id = id;
		this.displayName = displayName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.blogPosts = blogPosts;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "display_name", unique = true, nullable = false, length = 45)
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Column(name = "first_name", length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "blogAuthor")
	public Set<BlogPost> getBlogPosts() {
		return this.blogPosts;
	}

	public void setBlogPosts(Set<BlogPost> blogPosts) {
		this.blogPosts = blogPosts;
	}

}
