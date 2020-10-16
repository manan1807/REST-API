package io.java.springboot.lessonscontroller;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

	@Autowired
	LessonRepository lessonRepository;
	
	
	public List<Lessons> getAllLesson(String courseId)
	{
		//return topics;
		List<Lessons> lesson = new ArrayList<Lessons>();
		lessonRepository.findByCourseId(courseId).forEach(lesson::add);
		return lesson;
	}
	
	public Lessons getLesson(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return lessonRepository.findOne(id);
	}

	public void addLesson(Lessons lesson) {
		//topics.add(topic);
		lessonRepository.save(lesson);
		
	}

	public void updateLesson(String id, Lessons lesson) {
		
//		for(int i=0;i<topics.size();i++)
//		{
//			Topic t = topics.get(i);
//			if(t.getId().equals(id))
//		{topics.set(i, topic);
//			return;
//		}
//		}
		
		lessonRepository.save(lesson);
	}

	public void deleteLesson(String id, Lessons lesson) {
//		topics.removeIf(t -> t.getId().equals(id));
//		return;
		
		lessonRepository.delete(id);
	}
	
}
