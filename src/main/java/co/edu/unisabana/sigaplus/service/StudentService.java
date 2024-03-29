package co.edu.unisabana.sigaplus.service;

import co.edu.unisabana.sigaplus.model.Student;
import co.edu.unisabana.sigaplus.repository.StudentRepository;
import co.edu.unisabana.sigaplus.service.exception.StudentIdAlreadyExistsException;
import co.edu.unisabana.sigaplus.service.exception.StudentNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService implements IStudent{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        if (!studentRepository.existsById(student.getId())){
            return studentRepository.save(student);
        } else {
            throw new StudentIdAlreadyExistsException(student.getId());
        }
    }

    @Override
    public Student getStudentById(Integer id) {
        if (studentRepository.existsById(id)){
            return studentRepository.getReferenceById(id);
        } else {
            throw new StudentNotFoundException(id);
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

