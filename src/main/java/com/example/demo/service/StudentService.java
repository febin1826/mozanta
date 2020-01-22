package com.example.demo.service;

import com.example.demo.dto.StudentDetailsDto;

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
public interface StudentService {
    List<StudentDetailsDto> getAllStudents();

    StudentDetailsDto addStudent(StudentDetailsDto studentDetailsDto);

    StudentDetailsDto getStudentDetails(String name);
}
