package com.spring.core.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Teacher {

	@Value("${teacher.name}")
	private String name;

	@Value("${teacher.id}")
	private String id;

	@Autowired
	@Qualifier("englishSubjectBean")
	private Subject subject;
	
	public void displaySubjectDetails() {
		System.out.println("Teacher name :"+name);
		System.out.println("Teacher id :"+id);
		subject.teach();
	}
}
