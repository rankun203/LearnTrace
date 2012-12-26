package com.mindfine.Spring.FirstSpring.service;

import com.mindfine.Spring.FirstSpring.DAO.IUserDAO;
import com.mindfine.Spring.FirstSpring.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-24
 * Time: 上午11:46
 */
public class UserService {
    IUserDAO dao;
    public boolean addUser(User user) throws Exception {
        return this.dao.addUser(user);
    }

    public IUserDAO getDao() {
        return dao;
    }

    public void setDao(IUserDAO dao) {
        this.dao = dao;
    }
}
