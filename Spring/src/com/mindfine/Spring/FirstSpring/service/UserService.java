package com.mindfine.Spring.FirstSpring.service;

import com.mindfine.Spring.FirstSpring.DAO.UserDAO;
import com.mindfine.Spring.FirstSpring.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-24
 * Time: 上午11:46
 */
public class UserService {
    UserDAO dao;
    public boolean addUser(User user) throws Exception {
        return this.dao.addUser(user);
    }

    public UserDAO getDao() {
        return dao;
    }

    public void setDao(UserDAO dao) {
        this.dao = dao;
    }
}
