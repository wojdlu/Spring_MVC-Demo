package com.wojdlu.spring.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/form")
    public String showForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "student-form";
    }
    @RequestMapping("/processForm")
    public String studentResult(@ModelAttribute("student") Student student){
        System.out.println(student.getFirstName() + "  " + student.getLastName());
        return "studentResult";
    }
}
