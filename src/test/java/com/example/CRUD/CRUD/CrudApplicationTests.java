package com.example.CRUD.CRUD;

import com.example.CRUD.CRUD.Entity.Student;
import com.example.CRUD.CRUD.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class CrudApplicationTests {
    @Autowired
	private StudentRepository studentRepo;

	@Test
	void saveStudent() {
		Student s = new Student();
		s.setName("stallen");
		s.setCity("bhilai");
		s.setFee(1000);

		studentRepo.save(s);
	}

//	@Test
//
//	void deleteStudent() {
//	studentRepo.deleteById(4l);
//	}

//	@Test
//	void updateStudent() {
//		Student s = new Student();
//		s.setId(1l);
//		s.setName("maddy");
//		s.setCity("bhilai");
//		s.setFee(2000);
//
//		studentRepo.save(s);
//	}

//	@Test
//
//	void allStudent() {
//		Iterable<Student> all = studentRepo.findAll();
//		for(Student student : all){
//
//			System.out.println(student.getId());
//			System.out.println(student.getName());
//			System.out.println(student.getCity());
//			System.out.println(student.getFee());
//
//		}
//	}

	@Test
	void findStudentById() {
		Optional<Student> byId = studentRepo.findById(7l);
		Student student = byId.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCity());
		System.out.println(student.getFee());
	}



	}
