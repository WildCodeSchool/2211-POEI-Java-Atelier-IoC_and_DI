package fr.wildcodeschool.students.controllers;

import fr.wildcodeschool.students.dao.StudentDao;
import fr.wildcodeschool.students.models.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    @Qualifier("studentRepoTls")
    private StudentDao daoTls;

    @Autowired
    @Qualifier("studentRepoBdx")
    private StudentDao daoBdx;

    @ResponseBody
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> studentTls = daoTls.findAll();
        List<Student> studentBdx = daoBdx.findAll();

        List<Student> students = new ArrayList<>();
        students.addAll(studentTls);
        students.addAll(studentBdx);

        return students;
    }

}