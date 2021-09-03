package com.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.configuration.StudentConfig;
import com.spring.core.model.Student;

public class MainClass 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = context.getBean(Student.class);
        student.studentDetails();
    }
}
