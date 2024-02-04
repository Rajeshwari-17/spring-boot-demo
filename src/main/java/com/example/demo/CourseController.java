package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
//import org.springframework.RequestMapping;
@Controller
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses()
	{
		return Arrays.asList(new Course(1,"AwsCourse","to"),
				new Course(2,"Learn Azure","to"));
	}
	

}
