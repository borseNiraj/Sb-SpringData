package com.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Student;
import com.ashokit.repository.StudentRepository;

@SpringBootApplication
public class SbDataJpaCrudRepositoryAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbDataJpaCrudRepositoryAppApplication.class, args);
	
	        StudentRepository studentRepository = context.getBean(StudentRepository.class);
	
	        Student student = new Student();
	        student.setStudentId(100);
	        student.setStudentEmail("niraj@gmail.com");
              student.setStudentName("niraj");
              student.setStudentAge(28);
             
              
              Student save = studentRepository.save(student);
   
              System.out.println(save);
              
              Optional<Student> findById = studentRepository.findById(101);
                   System.out.println(findById);
	}

}
