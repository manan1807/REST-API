package io.java.springboot.jspcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.java.springboot.coursecontroller.Course;
import io.java.springboot.coursecontroller.CourseService;
import io.java.springboot.lessonscontroller.LessonService;
import io.java.springboot.lessonscontroller.Lessons;
import io.java.springboot.topiccontroller.Topic;
import io.java.springboot.topiccontroller.TopicService;



@Controller
public class JspController {
	
	@Autowired	
	TopicService topicservice;
	@Autowired
	CourseService courseService;
	@Autowired
	LessonService lessonService;
	
	@GetMapping("/welcome")
	public String homePage(ModelMap model)
	{
		List<Topic> topics = new ArrayList<>(); 
		topics = topicservice.getAllTopics();
		model.put("topics", topics);
		return "welcome";
	}
	
	@GetMapping("/AddTopic")
	public String homePage1(ModelMap model)
	{
		
		return "AddTopic";
	}
	
	@RequestMapping(value="/welcome/topics", produces="application/json",method=RequestMethod.GET)
	 public	 @ResponseBody List<Course>  getAllCourses(@RequestParam("id") String topicId, ModelMap model)
	{
		//System.out.println("-----------------");
		 List<Course> results = courseService.getAllCourse(topicId); 
		 model.put("courses", results);
		 return results;
		 
		
	}
	
//	 @GetMapping(value= "/welcome/courses/lessons", produces="application/json")
//	 public  @ResponseBody List<Lessons>  getLesson(@RequestParam("id") String courseId)
//	 {
//		 System.out.println(courseId); 
//		  List<Lessons>  lesson = lessonService.getAllLesson(courseId);
//		 System.out.print(lesson); 
//		return lesson;
//		
//	 }
	 
	@GetMapping( "/welcome/courses/lessons")
	public String displayLessons(@RequestParam("id") String courseId)
	{
//		List<Lessons> llist = new ArrayList<>();
//				llist = lessonService.getAllLesson(courseId);
//				model.put("lessons", llist);
		return "lessons";
	}
	
}
