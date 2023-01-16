package fr.wildcodeschool.students.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.wildcodeschool.students.dao.StudentDao;
import fr.wildcodeschool.students.models.Student;

@Repository
public class StudentRepoBdx implements StudentDao {

	@Override
	public List<Student> findAll() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Roger"));
		students.add(new Student("Sandrine"));
		students.add(new Student("Matthieu"));
		return students;
	}

}
