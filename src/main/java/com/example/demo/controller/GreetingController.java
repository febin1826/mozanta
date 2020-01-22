package com.example.demo.controller;

import com.example.demo.dto.ApparelFilter;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/apparels")
public class GreetingController {

    @GetMapping("/{company}")
    public String getGreeting(@PathVariable("company") String company) {
        return company;
    }

    @GetMapping("")
    public String getApparels(ApparelFilter apparelFilter) {
        return apparelFilter.getBrand()+" "+ apparelFilter.getColor()+ " "+ apparelFilter.getSize();
    }

}
