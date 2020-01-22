package com.example.demo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

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
@Document(collection = "student")
@Data
public class Student extends Person {

    int rollNo;

    int marks;

    String course;

}
