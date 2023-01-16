package fr.wildcodeschool.students.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.*;

import fr.wildcodeschool.students.dao.StudentDao;
import fr.wildcodeschool.students.models.Student;

@Repository
public class StudentRepoTls implements StudentDao {

	public String test() {
		return "toto";
	}

	@Override
	public List<Student> findAll() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Bernard"));
		students.add(new Student("Test"));
		students.add(new Student("Laverne"));
		return students;
	}

}
