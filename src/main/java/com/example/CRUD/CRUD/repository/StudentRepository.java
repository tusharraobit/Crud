package com.example.CRUD.CRUD.repository;

import com.example.CRUD.CRUD.Entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {


}
