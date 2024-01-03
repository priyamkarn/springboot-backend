package com.scalar.springboot1project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
  /*
  activates http request
  */
public class Taskcon {
/*
  http get request
  
  /*
  
    @GetMapping("/hello")
    public String hello()
    {
        return "priyam is a good boy";
    }

}
