package co.edu.unisabana.sigaplus.service;

import co.edu.unisabana.sigaplus.model.Student;

public interface IStudent {
    Student saveStudent(Student student);
    Student getStudentById(Integer id);
}
