package io.java.springboot.lessonscontroller;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lessons, String> {

	public List<Lessons> findByCourseId(String id);
}
