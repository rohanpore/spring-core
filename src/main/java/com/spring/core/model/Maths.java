package com.spring.core.model;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Maths implements Subject {

	@Value("${mathsSubject.name}")
	private String subjectName;

	public void teach() {
		System.out.println("Name of subject is: "+subjectName);
	}

}
