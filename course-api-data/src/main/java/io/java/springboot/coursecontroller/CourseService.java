package io.java.springboot.coursecontroller;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	
	public List<Course> getAllCourse(String topicId)
	{
		//return topics;
		List<Course> course = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId).forEach(course::add);
		return course;
	}
	
	public Optional<Course> getCourse(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
		
	}

	public void updateCourse(String id, Course course) {
		
//		for(int i=0;i<topics.size();i++)
//		{
//			Topic t = topics.get(i);
//			if(t.getId().equals(id))
//		{topics.set(i, topic);
//			return;
//		}
//		}
		
		courseRepository.save(course);
	}

	public void deleteCourse(String id, Course course) {
//		topics.removeIf(t -> t.getId().equals(id));
//		return;
		
		courseRepository.deleteById(id);
	}
	
}
