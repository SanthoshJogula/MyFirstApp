package com.santhosh.MyFirstApp.controller;

import com.santhosh.MyFirstApp.model.Student;
import com.santhosh.MyFirstApp.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value="/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public User getUser(){
        return new User(112,"Shiva",1000,"Kailash");
    }

    // use the @ResponseBody annotation for @Controller. the @RestController have the @ResponseBody annotation by default.
    //public @ResponseBody Student getUserName(){}
    @RequestMapping(value="/student", method = RequestMethod.GET)
    public Student getUserName(@RequestHeader(value = "role") String role, @RequestHeader(value = "jwt") String jwt, @RequestBody User user){
        System.out.println(role);
        System.out.println(jwt);
        return new Student(user.getId(), user.getName(), user.getAge(), user.getLocation(), 1100,"B.Tech");
    }

}
