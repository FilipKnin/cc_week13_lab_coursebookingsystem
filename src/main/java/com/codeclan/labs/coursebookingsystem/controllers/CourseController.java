package com.codeclan.labs.coursebookingsystem.controllers;

import com.codeclan.labs.coursebookingsystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/courses")

public class CourseController {

    @Autowired
    CourseRepository courseRepository;

}
