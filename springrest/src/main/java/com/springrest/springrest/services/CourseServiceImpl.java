package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entitites.Course;

@Service
public class CourseServiceImpl implements CourseService {

//	List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl()
	{
//		list = new ArrayList<>();
//		list.add(new Course(1,"Java","Learn Basic of java"));
//		list.add(new Course(2,"Java Spring Boot","Make spring rest Api"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		
//		return list;
		return courseDao.findAll();
	}


	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) 
	{
//		Course c = null;
//	    for(Course course :list )
//	    {
//	    	if(courseId == course.getId())
//	    	{
//	    		c = course;
//	    		break;
//	    	}
//	    }
//	    
//	    return c;
		
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
		
		courseDao.save(course);
		return course;
	}


	@Override
	public Course updateCourse(Course course) {
		
//		for(Course c : list)
//		{
//			if(c.getId() == course.getId())
//			{
//				c.setDescription(course.getDescription());
//				c.setTitle(course.getTitle());
//			}
//		}
//		
//		return course;
		
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse(long courseId) {
//		
//	  for(Course c : list)
//		{
//			if(c.getId() == courseId)
//			{
//				list.remove(c);
//				break;
//			}
//		}
//		
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}

}
