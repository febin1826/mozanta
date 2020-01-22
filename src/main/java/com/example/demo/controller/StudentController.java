package com.example.demo.controller;

import com.example.demo.dto.StudentDetailsDto;
import com.example.demo.facade.Personfacade;
import com.example.demo.facade.StudentFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentFacade studentFacade;
    Personfacade personfacade;

    @GetMapping()
    public List<StudentDetailsDto> getAllStudents() {
        return studentFacade.getAllStudents();
    }

    @PostMapping()
    public StudentDetailsDto addStudent(@RequestBody StudentDetailsDto studentDetailsDto){
        return studentFacade.addStudent(studentDetailsDto) ;
    }


    @GetMapping("/details")
    public StudentDetailsDto getStudentDetails(@RequestParam String name) {
        return studentFacade.getStudentDetails(name);
    }

}
