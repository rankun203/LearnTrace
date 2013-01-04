package com.mindfine.spring.dao.impl;

import com.mindfine.spring.dao.IStudentDAO;
import com.mindfine.spring.model.Student;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 13-1-3
 * Time: 上午12:27
 */
@Component("stuImpl")
public class IStudentImpl implements IStudentDAO {
    DataSource datasource;
    @Override
    public void save(Student student) {
        System.out.println("IStudentImpl report: " + student + " saved.");
        ResultSet rs = null;
        try {
            Connection dbc = datasource.getConnection();
            rs = dbc.createStatement().executeQuery("select * from Persons");
            while(rs.next()){
                System.out.println("IStudentImpl report: data from db- " + rs.getString("FirstName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Resource(name = "dataSource")
    public void setDbc(DataSource ds) throws SQLException {
        this.datasource = ds;
    }
}
