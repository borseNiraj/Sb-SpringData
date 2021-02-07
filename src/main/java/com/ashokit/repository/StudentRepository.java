package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Serializable> {

}
