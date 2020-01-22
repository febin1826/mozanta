package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByName(String name);

}
