package com.versioning.controller;

import com.versioning.model.StudentV1;
import com.versioning.model.StudentV2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class URIVersioningController {

    @GetMapping(value = "/v1/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentV1 findStudentV1(){
        return StudentV1.builder().firstName("jim").lastName("jack").courseStartDate(new Date()).course("java").build();
    }

    @GetMapping(value = "/v2/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentV2 findStudentV2(){
        return StudentV2.builder().name("jack").courseStartDate(new Date()).course("java").build();
    }
}
