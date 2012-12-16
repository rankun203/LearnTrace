package com.mindfine.hibernate.orMapping;

import com.mindfine.hibernate.orMapping.DB.SessionFactoryTool;
import com.mindfine.hibernate.orMapping.VO.Student;
import com.mindfine.hibernate.orMapping.VO.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-17
 * Time: 上午12:04
 */
public class TestCascadeSynchronize {
    private static SessionFactory sf = null;
    @BeforeClass
    public static void  beforeClass(){
        sf = SessionFactoryTool.getSessionFactory();
    }

    @Test
    public void testCascade(){
        Student student = new Student();
        student.setName("s1");

        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student);

        Teacher teacher = new Teacher();
        teacher.setName("t1");
        teacher.setStudents(studentSet);

        Session session = sf.getCurrentSession();
        session.beginTransaction();
        session.save(teacher);
        session.getTransaction().commit();

    }

    @AfterClass
    public static void afterClass(){
        if (sf != null) {
            sf.close();
        }
    }
}
