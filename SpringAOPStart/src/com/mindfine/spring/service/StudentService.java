package com.mindfine.spring.service;

import com.mindfine.spring.dao.IStudentDAO;
import com.mindfine.spring.model.Student;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 13-1-3
 * Time: 上午11:31
 */
@Component("studentService")
public class StudentService {
    IStudentDAO studentDAO;
    public void addStudent(Student student){
        studentDAO.save(student);
    }

    public IStudentDAO getStudentDAO() {
        return studentDAO;
    }

    @Resource(name = "stuImpl")
    public void setStudentDAO(IStudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
}
