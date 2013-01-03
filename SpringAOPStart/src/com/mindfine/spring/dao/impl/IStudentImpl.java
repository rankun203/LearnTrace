package com.mindfine.spring.dao.impl;

import com.mindfine.spring.dao.IStudentDAO;
import com.mindfine.spring.model.Student;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 13-1-3
 * Time: 上午12:27
 */
@Component("stuImpl")
public class IStudentImpl implements IStudentDAO {
    @Override
    public void save(Student student) {
        System.out.println("IStudentImpl report: " + student + " saved.");
    }
}
