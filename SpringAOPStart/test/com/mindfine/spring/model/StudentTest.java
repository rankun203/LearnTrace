package com.mindfine.spring.model;

import com.mindfine.spring.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 13-1-2
 * Time: 上午11:32
 */
public class StudentTest {
    @Test
    public void testStudent(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        StudentService studentService = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(1);
        student.setName("Who am I");
        studentService.addStudent(student);
    }
}
