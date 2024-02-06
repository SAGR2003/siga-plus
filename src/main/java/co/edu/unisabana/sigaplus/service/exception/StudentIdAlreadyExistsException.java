package co.edu.unisabana.sigaplus.service.exception;

public class StudentIdAlreadyExistsException extends RuntimeException{
    public StudentIdAlreadyExistsException(int id) {
        super("There is already a student with id " + id + ", try again!!!");
    }
}
