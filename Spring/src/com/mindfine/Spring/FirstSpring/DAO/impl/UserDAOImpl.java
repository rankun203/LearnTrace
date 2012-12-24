package com.mindfine.Spring.FirstSpring.DAO.impl;

import com.mindfine.Spring.FirstSpring.DAO.UserDAO;
import com.mindfine.Spring.FirstSpring.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-24
 * Time: 上午11:00
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public boolean addUser(User user) throws Exception {
        System.out.println("UserDAOImpl report: " + " User " + user.getName() + " Add Success.");
        return true;
    }
}
