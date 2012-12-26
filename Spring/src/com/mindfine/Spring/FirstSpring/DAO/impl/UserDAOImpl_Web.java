package com.mindfine.Spring.FirstSpring.DAO.impl;

import com.mindfine.Spring.FirstSpring.DAO.IUserDAO;
import com.mindfine.Spring.FirstSpring.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-26
 * Time: 上午10:27
 */
public class UserDAOImpl_Web implements IUserDAO {
    @Override
    public boolean addUser(User user) throws Exception {
        System.out.println("Publish success.");
        return true;
    }
}
