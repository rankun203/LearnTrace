package com.mindfine.hibernate.orMapping;

import com.mindfine.hibernate.orMapping.VO.User;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-19
 * Time: 上午10:56
 */
public class TestUpdate extends SuperTest{

    @Test
    public void testUpdate(){
        session.beginTransaction();
        User user = (User) session.get(User.class, 1);
        user.setName("userr1");
        user.getGroup().setName("grouppp11");
        session.update(user);
        session.getTransaction().commit();
    }

}
