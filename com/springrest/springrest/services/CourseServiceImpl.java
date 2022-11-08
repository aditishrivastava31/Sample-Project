package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl  implements CourseService {
	List<Course> list;
	
	public CourseServiceImpl() {
		
		list=new ArrayList<>();
		list.add(new Course(123L,"java core courses","this courses contain java basic "));
		list.add(new Course(4343L,"spring boot course","creating rest apis"));
	}
	
	

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(Long courseId) {
		
		Course c=null;
		for(Course course:list) {
			
			if(course.getId()==courseId) {
				
				c=course;
				break;
			}
		}
		return c;
			
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	



}
