package com.example.springdataworkshop.service;

import com.example.springdataworkshop.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;



    @Transactional
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
}
