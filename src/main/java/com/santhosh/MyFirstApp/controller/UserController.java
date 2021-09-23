package com.santhosh.MyFirstApp.controller;

import com.santhosh.MyFirstApp.model.Student;
import com.santhosh.MyFirstApp.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value="/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public User getUser(){
        return new User(112,"Shiva",1000,"Kailash");
    }

    @RequestMapping(value="/student", method = RequestMethod.GET)
    public Student getUserName(){
        return new Student(1,"San", 28, "Siddigam",1100,"B.Tech");
    }

}
