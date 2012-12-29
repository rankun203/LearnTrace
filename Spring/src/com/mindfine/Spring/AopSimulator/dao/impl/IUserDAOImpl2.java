package com.mindfine.Spring.AopSimulator.dao.impl;

import com.mindfine.Spring.AopSimulator.dao.IUserDAO;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-28
 * Time: 上午10:32
 */
public class IUserDAOImpl2 implements IUserDAO {

    @Override
    public void saveUser(String username) throws Exception {
        System.out.println("IUserDAOImpl2发来贺电： " + username + "存储成功。");
        this.wait(1000);
    }
}
