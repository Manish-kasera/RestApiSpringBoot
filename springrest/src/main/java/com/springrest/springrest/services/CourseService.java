package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entitites.Course;


public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
    
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long courseId);
}
