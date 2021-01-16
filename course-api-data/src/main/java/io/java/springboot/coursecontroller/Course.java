package io.java.springboot.coursecontroller;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.java.springboot.topiccontroller.Topic;

@Entity
@Table(name="course")
public class Course {

	@Id
	@Column(name= "cid")
	private String id;
	@Column(name= "cname")
	private String name;
	@Column(name= "cdescription")
	private String description;
	
	@ManyToOne()
	@JoinColumn(name = "id")
	private Topic topic;
	 
	

	public Course(String id, String name, String description,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId,"","");
	}
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Course() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
