package com.scalar.springboot2.Controller;

import com.scalar.springboot2.entities.Course;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/priyam")
public class MyController {

    public List<Course> courses;

    public MyController() {
        this.courses = new ArrayList<>();
        // sample data for testing
        this.courses.add(new Course(1, "Course 1", "Description 1"));
        this.courses.add(new Course(2, "Course 2", "Description 2"));
    }

    @GetMapping("/Courses")
    public List<Course> getCourses() {
        return courses;
    }
    @PostMapping("/Courses")
    public Course addcourse(@RequestBody Course newCourse )
    {
        long newID=courses.size()+1;
        newCourse.setID(newID);
        newCourse.setTitle("TITLE4");
        newCourse.setDescription("description4");
        courses.add(newCourse);
        return newCourse;
    }
    
}

