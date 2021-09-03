package com.spring.core.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Student {

	@Value("${student.name}")
	private String name;

	@Value("${student.id}")
	private String id;

	@Autowired
	private Teacher teacher;
	
	public void studentDetails() {
		System.out.println("Name of Student is :"+name);
		System.out.println("Id of Student is :"+id);
		teacher.displaySubjectDetails();
	}
}
