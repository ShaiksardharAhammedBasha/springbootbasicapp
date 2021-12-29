package com.kindson.springbotdockerapp.controllers;

import com.kindson.springbotdockerapp.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/")
    public String homePage() {
        return "Spring Boot Using Docker And Using Person As Models";
    }

    @GetMapping("/person/{id}")
    public String getPersonById(Integer id) {
        return "personUsingParam";
    }
}
