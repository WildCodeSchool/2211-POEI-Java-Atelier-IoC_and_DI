package fr.wildcodeschool.students.dao;

import java.util.List;

import fr.wildcodeschool.students.models.Student;

public interface StudentDao {

	List<Student> findAll();

}
