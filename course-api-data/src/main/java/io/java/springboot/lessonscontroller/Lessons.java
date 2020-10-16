package io.java.springboot.lessonscontroller;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.java.springboot.coursecontroller.Course;
import io.java.springboot.topiccontroller.Topic;

@Entity
@Table(name="lesson")
public class Lessons {

	@Id
	@Column(name= "lid")
	private String lid;
	@Column(name= "lname")
	private String lname;
	@Column(name= "ldescription")
	private String ldescription;
	
	@ManyToOne()
	@JoinColumn(name = "cid")
	private Course course ;

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLdescription() {
		return ldescription;
	}

	public void setLdescription(String ldescription) {
		this.ldescription = ldescription;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Lessons() {
		super();
	}

	public Lessons(String lid, String lname, String ldescription, String courseId) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.ldescription = ldescription;
		this.course = new Course(courseId,"","","");
	}
	
}
