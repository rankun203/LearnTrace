package com.mindfine.Spring.simulation.DAO;

import com.mindfine.Spring.simulation.model.User;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-24
 * Time: 上午10:59
 */
public interface UserDAO {
    public boolean addUser(User user) throws Exception;
}
