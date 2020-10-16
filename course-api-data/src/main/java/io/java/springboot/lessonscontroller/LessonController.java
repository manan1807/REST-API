package io.java.springboot.lessonscontroller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.java.springboot.coursecontroller.Course;


@RestController
public class LessonController {

	@Autowired
	private LessonService lessonService;
	
	@RequestMapping("/courses/{courseId}/lessons")
	public List<Lessons> getAllLessons(@PathVariable String courseId)
	{
		return lessonService.getAllLesson(courseId); 
	}

	@RequestMapping("/courses/{courseId}/lessons/{id}")
	public Lessons getLesson(@PathVariable String id)
	{
		return lessonService.getLesson(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/courses/{courseId}/lessons")
	public void addLesson(@RequestBody Lessons lesson, @PathVariable String courseId) {
		lesson.setCourse(new Course(courseId,"","",""));
		lessonService.addLesson(lesson);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/courses/{courseId}/lessons/{id}")
	public void updateCourse(@RequestBody Lessons lesson, @PathVariable String id, @PathVariable String courseId) {
		lesson.setCourse(new Course(courseId,"","",""));
		lessonService.updateLesson(id,lesson);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/courses/{courseId}/lessons/{id}")
	public void deleteCourse(@RequestBody Lessons lesson, @PathVariable String id) {
		lessonService.deleteLesson(id,lesson);
	}
}
