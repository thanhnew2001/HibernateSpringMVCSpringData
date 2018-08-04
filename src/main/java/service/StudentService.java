package service;

import model.Student;
import model.Teacher;
import model.Visit;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by CoT on 10/14/17.
 */
@Transactional
@Service
public class StudentService {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //add, update, delete, getAll, get1

    public int addStudent(Student student){
        //assign student to visits:

        for (Visit visit: student.getVisits()){
            visit.setStudent(student);
        }

        sessionFactory.getCurrentSession().save(student);
        return student.getId();
    }

    public void updateStudent(Student student){
        sessionFactory.getCurrentSession().update(student);
    }

    public void deleteStudent(int  studentId){
        Student student = getStudent(studentId);
        sessionFactory.getCurrentSession().delete(student);

    }

    public List<Student> getAllStudents(){
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

    public Student getStudent(int  studentId){
        return (Student) sessionFactory.getCurrentSession().get(Student.class, studentId);

    }






}
