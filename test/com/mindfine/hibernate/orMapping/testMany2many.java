package com.mindfine.hibernate.orMapping;

import com.mindfine.hibernate.orMapping.DB.SessionFactoryTool;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-15
 * Time: 下午11:37
 */
public class testMany2many {
    private static SessionFactory sf = null;

    @BeforeClass
    public static void beforeClass(){
        sf = SessionFactoryTool.getSessionFactory();
    }

    @Test
    public void testMany2many(){
        new SchemaExport(new Configuration().configure()).create(true, true);
    }

    @AfterClass
    public static void afterClass(){
        if (sf != null) {
            sf.close();
        }
    }
}
