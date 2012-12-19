package com.mindfine.hibernate.orMapping;

import com.mindfine.hibernate.orMapping.VO.Student;
import com.mindfine.hibernate.orMapping.VO.Teacher;
import org.hibernate.Session;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-17
 * Time: 上午12:04
 */
public class TestCascadeSynchronize extends SuperTest{

    @Test
    public void testCascade(){
        Student student = new Student();
        student.setName("s1");

        Teacher teacher = new Teacher();
        teacher.setName("t1");

        student.getTeachers().add(teacher);

        Session session = sf.getCurrentSession();
        session.beginTransaction();
        session.save(teacher);
        session.getTransaction().commit();

    }

}
