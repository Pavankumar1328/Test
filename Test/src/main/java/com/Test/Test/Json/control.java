package com.Test.Test.Json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {

    @Autowired
    student student;
    @GetMapping("/list")
    public student list(){
        student.setName("pavan");
        student.setDepartment("Mech");
        return student;
    }
}
