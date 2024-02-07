package co.edu.unisabana.sigaplus.service;

import co.edu.unisabana.sigaplus.model.Student;

import java.util.List;

public interface IStudent {
    Student saveStudent(Student student);
    Student getStudentById(Integer id);
    List<Student> getAllStudents();
}
