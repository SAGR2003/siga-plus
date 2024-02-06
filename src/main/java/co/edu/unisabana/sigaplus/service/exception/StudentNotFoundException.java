package co.edu.unisabana.sigaplus.service.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(int studentId) {
        super("Student with id " + studentId + " was not found");
    }
}
