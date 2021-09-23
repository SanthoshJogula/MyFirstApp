package com.santhosh.MyFirstApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student extends User{
    private int marks;
    private String Education;

    public Student(int id, String name, int age, String location, int marks, String education) {
        super(id, name, age, location);
        this.marks = marks;
        Education = education;
    }
}
