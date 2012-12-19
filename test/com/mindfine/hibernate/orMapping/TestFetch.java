package com.mindfine.hibernate.orMapping;

import com.mindfine.hibernate.orMapping.VO.Group;
import com.mindfine.hibernate.orMapping.VO.User;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-18
 * Time: 下午1:01
 */
public class TestFetch extends SuperTest{
    @Test
    public void addData(){
        User u1 = new User();
        User u2 = new User();
        Group g1 = new Group();
        Group g2 = new Group();

        u1.setName("u1");
        u2.setName("u2");
        g1.setName("g1");
        g2.setName("g2");

        u1.setGroup(g1);
        u2.setGroup(g2);
        g1.getUserSet().add(u1);
        g1.getUserSet().add(u2);

        session.beginTransaction();
        session.save(u1);
        session.save(u2);
        session.getTransaction().commit();

    }

    @Test
    public void testFetch(){
        session.beginTransaction();
        User user = (User)session.load(User.class, 1);

System.out.println("user.group: " + (user == null ? "null" : user.getGroup().getName()));

        session.getTransaction().commit();

    }

}
