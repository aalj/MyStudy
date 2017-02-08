package com.imooc.service;

import com.imooc.model.Course;
import org.springframework.stereotype.Service;


@Service
public interface CourseService {
	
	
	Course getCoursebyId(Integer courseId);
	

	
	

}
