package com.mindfine.hibernate.orMapping;

import com.mindfine.hibernate.orMapping.DB.SessionFactoryTool;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-19
 * Time: 上午10:56
 * protected static SessionFactory sf : SessionFactory的实例
 * protected static Session session   : Session实例
 */
public class SuperTest {
    protected static SessionFactory sf = null;
    protected static Session session = null;
    @BeforeClass
    public static void beforeClass(){
        sf = SessionFactoryTool.getSessionFactory();
        session = sf.getCurrentSession();
    }

    @AfterClass
    public static void afterClass(){
        if (sf != null) {
            sf.close();
        }
    }
}
