package com.mindfine.hibernate.orMapping;

import com.mindfine.hibernate.orMapping.DB.SessionFactoryTool;
import com.mindfine.hibernate.orMapping.VO.Group;
import com.mindfine.hibernate.orMapping.VO.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-18
 * Time: 下午1:01
 */
public class TestFetch {
    private static SessionFactory sf = null;
    private static Session session = null;
    @BeforeClass
    public static void beforeClass(){
        sf = SessionFactoryTool.getSessionFactory();
        session = sf.getCurrentSession();
    }

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
        User user = (User)session.get(User.class, 1);
        User user1 = (User)session.get(User.class, 3);

System.out.println("user:" + (user == null ? "null" : user.getName()));
System.out.println("user1:" + (user1 == null ? "null" : user1.getName()));

System.out.println("user.group: " + (user == null ? "null" : user.getGroup().getName()));
System.out.println("user1.group:" + (user1 == null ? "null" : user1.getGroup().getName()));

        session.getTransaction().commit();

    }

    @AfterClass
    public static void afterClass(){
        if (sf != null) {
            sf.close();
        }
    }
}
