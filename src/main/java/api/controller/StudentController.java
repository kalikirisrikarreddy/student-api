package api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import api.model.Student;

@RestController
public class StudentController {

  @GetMapping("/api/v1/students/{id}")
  public ResponseEntity<Student> getStudent(@PathVariable(name = "id") String id) {
    Student student = new Student();
    student.setId(id);
    student.setFirstName("Srikar");
    student.setMiddleName("Reddy");
    student.setLastName("Kalikiri");
    return new ResponseEntity<>(student, HttpStatus.OK);
  }

}
