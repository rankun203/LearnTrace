package com.mindfine.Spring.AopSimulator.dao.impl;

import com.mindfine.Spring.AopSimulator.dao.IUserDAO;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-28
 * Time: 上午10:27
 */
public class IUserDAOImpl implements IUserDAO {
    @Override
    public void saveUser(String username) throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        System.out.println("IUserDAOImpl发来贺电： <" + username + ">存储成功。");
    }
}
