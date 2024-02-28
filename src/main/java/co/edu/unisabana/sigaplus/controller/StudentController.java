package co.edu.unisabana.sigaplus.controller;

import co.edu.unisabana.sigaplus.controller.dto.ListStudentsResponseDTO;
import co.edu.unisabana.sigaplus.controller.dto.StudentResponseDTO;
import co.edu.unisabana.sigaplus.model.Student;
import co.edu.unisabana.sigaplus.service.IStudent;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
    private IStudent studentService;

    @GetMapping("/{id}")
    private StudentResponseDTO getStudentById(@PathVariable int id){
        Student student = studentService.getStudentById(id);

        return new StudentResponseDTO(
                student.getId(),
                student.getName(),
                student.getSemester()
        );
    }

    @GetMapping("")
    private ListStudentsResponseDTO getStudents(){
        return new ListStudentsResponseDTO(studentService.getAllStudents());
    }

    @PostMapping("")
    private StudentResponseDTO createStudent(@RequestBody Student student){
        Student newStudent = studentService.saveStudent(student);

        return new StudentResponseDTO(
                newStudent.getId(),
                newStudent.getName(),
                newStudent.getSemester()
        );
    }

    @GetMapping("/heartbeat")
    private String heartbeat(){
        return "OK :)";
    }

    @GetMapping("/nuevafun")
    private String nuevaFuncionalidad(){
        return "Nueva funcionalidad >:)(";
    }
}
