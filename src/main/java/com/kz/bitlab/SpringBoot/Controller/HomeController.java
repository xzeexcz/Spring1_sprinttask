package com.kz.bitlab.SpringBoot.Controller;


import com.kz.bitlab.SpringBoot.db.DBManager;
import com.kz.bitlab.SpringBoot.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String home(Model model) {
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("stu",students);
        return "home";
    }
    @PostMapping(value = "/addStudent")
    public String addStudent(@RequestParam(name = "student_name", defaultValue = "NO DATA") String name,
                             @RequestParam(name = "student_surname", defaultValue = "NO DATA") String surname,
                             @RequestParam(name = "student_exam", defaultValue = "0") int exam) {
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setExam(exam);
        if(student!=null) {
            DBManager.addStudent(student);
        }
        return "redirect:/";
    }
    @GetMapping(value = "/addStudent")
    public String addStudent() {
        return "addStudent";
    }
}
