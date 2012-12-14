package com.mindfine.hibernate.orMapping.DB;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-14
 * Time: 上午11:19
 */
public class SessionFactoryTool {
    private static final SessionFactory sf = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        return cfg.buildSessionFactory(sr);
    }

    public static SessionFactory getSessionFactory(){
        return sf;
    }
}
