package com.example.springdataworkshop.repository;

import com.example.springdataworkshop.entity.Guardian;
import com.example.springdataworkshop.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void contextLoads() {
        Student student = Student.builder()
                .emailId("iulian@gmail.com")
                .firstName("Iulian")
                .lastName("Darzu")
                //.guardianName("Andrei")
                //.guardianEmail("andrei@gmail.com")
                //.guardianMobile("069432312")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("andrei@gmail.com")
                .name("Andrei")
                .mobile("069432312")
                .build();

    Student student = Student.builder()
            .firstName("Slava")
            .emailId("slava@gmail.com")
            .lastName("Pinzaru")
            .guardian(guardian)

        .build();

    studentRepository.save(student);
    }
    @Test
    public void printAllStudent(){
        List<Student> studentList = 
                studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }
}