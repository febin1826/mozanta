package com.example.demo.facade;

import com.example.demo.dto.StudentDetailsDto;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
@Component
public class StudentFacadeImpl implements StudentFacade {

    @Autowired
    StudentService studentService;



    @Override
    public List<StudentDetailsDto> getAllStudents() {
        return studentService.getAllStudents();
    }

    @Override
    public StudentDetailsDto addStudent(StudentDetailsDto studentDetailsDto) {
        return studentService.addStudent(studentDetailsDto);
    }

    @Override
    public StudentDetailsDto getStudentDetails(String name) {
        return studentService.getStudentDetails(name);
    }
}
