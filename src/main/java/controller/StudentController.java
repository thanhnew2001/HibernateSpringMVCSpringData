package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.List;

/**
 * Created by CoT on 7/29/18.
 */
@RestController
@RequestMapping(path = "/")
public class StudentController { //is the place to declare the url to access to the data
    //end point = webAPI = web services
    //to run the project, cd to the path, then mvn jetty:run

    @Autowired
    private StudentService studentService;

    @RequestMapping(path="students", method = RequestMethod.GET)
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(path = "students", method = RequestMethod.POST)
    public int addStudent(@RequestBody  Student student){
        return studentService.addStudent(student);
    }

    @RequestMapping(path = "students/{studentId}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable int studentId){
        studentService.deleteStudent(studentId);
    }

    @RequestMapping(path = "students", method = RequestMethod.PUT)
    public void updateStudent(@RequestBody  Student student){
        studentService.updateStudent(student);
    }

    @RequestMapping(path = "students/{studentId}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable int studentId){
        return studentService.getStudent(studentId);
    }


}
