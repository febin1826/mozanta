package com.example.demo.service;

import com.example.demo.dto.StudentDetailsDto;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Copyright(c) 2019 Mozanta Technologies Private Ltd.
 * <p>
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of Mozanta ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the contract agreement you entered into with Mozanta.
 *
 * @author Deepak
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<StudentDetailsDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDetailsDto> studentsDto = new ArrayList<>();
        for (Student student : students) {
            StudentDetailsDto studentDetailsDto = new StudentDetailsDto();
            BeanUtils.copyProperties(student, studentDetailsDto);
            studentsDto.add(studentDetailsDto);
        }

        return studentsDto;
    }

    @Override
    public StudentDetailsDto addStudent(StudentDetailsDto studentDetailsDto) {

        Student student = new Student();

        BeanUtils.copyProperties(studentDetailsDto, student);
        Student savedStudent = studentRepository.save(student);

        StudentDetailsDto savedStudentDetails = new StudentDetailsDto();
        BeanUtils.copyProperties(savedStudent, savedStudentDetails);


        return savedStudentDetails;
    }

    @Override
    public StudentDetailsDto getStudentDetails(String name) {
        Student student = studentRepository.findByName(name);
        StudentDetailsDto studentDetailsDto = new StudentDetailsDto();
        BeanUtils.copyProperties(student,studentDetailsDto);
        return studentDetailsDto;
    }
}
