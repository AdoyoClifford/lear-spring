package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "learn azure", "Adoyo"),
                new Course(1, "learn devops", "Adoyo")
        );
    }
}
