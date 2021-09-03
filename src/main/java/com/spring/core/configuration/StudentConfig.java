package com.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.core.model.English;
import com.spring.core.model.Maths;
import com.spring.core.model.Student;
import com.spring.core.model.Subject;
import com.spring.core.model.Teacher;

@Configuration
@PropertySource("classpath:Student.properties")
public class StudentConfig {

	@Bean
	public Student studentBean() {
		return new Student();
	}

	@Bean
	public Teacher teacherBean() {
		return new Teacher();
	}

	@Bean
	public Subject mathsSubjectBean() {
		return new Maths();
	}

	@Bean
	public Subject englishSubjectBean() {
		return new English();
	}

}
