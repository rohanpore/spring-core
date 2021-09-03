package com.spring.core.model;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class English implements Subject {

	@Value("${englishSubject.name}")
	private String subjectName;

	public void teach() {
		System.out.println("Name of subject is: "+subjectName);
	}

}
