package com.example.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CourseModel;
import com.example.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class CourseRestController
{
    @Autowired
    StudentService studentService;

    @GetMapping("/course/view/{idCourse}")
    public CourseModel selectCourse(@PathVariable(value = "idCourse") String idCourse){
        CourseModel course = studentService.selectCourse (idCourse);
        return course;
    }

    @GetMapping("/course/viewall")
    public List<CourseModel> selectAllCourse(){
        List<CourseModel> courses = studentService.selectAllCourses();
        return courses;
    }
}