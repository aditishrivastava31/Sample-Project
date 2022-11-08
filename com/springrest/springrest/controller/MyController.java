package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	private static final String courseService = null;
	@Autowired
	private CourseService coursservice;
	
	@GetMapping("/home")
	public  String home() {
		
		return "welcome to courses apllication ";
	}
	
	//get the courses getCourse(Long.parseLong(courseId));
	
	@GetMapping("/courses")
	public  List<Course> getCourses()
	{
		
	return this.coursservice.getCourses();	
	
	}
@GetMapping("/courses/{courseId}")	
 public Course getCourse(@PathVariable String courseId) {
	 
	 return coursservice.getCourse(Long.valueOf(courseId));
 }	
@PostMapping("/courses")
public Course addCourse(@RequestBody Course course) 
{
	return coursservice.addCourse(course);
}

	
}



