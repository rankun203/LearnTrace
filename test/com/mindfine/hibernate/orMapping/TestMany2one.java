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
 * Time: 下午7:26
 */
public class TestMany2one {
    private static SessionFactory sf = null;

    @BeforeClass
    public static void beforeClass(){
        sf = SessionFactoryTool.getSessionFactory();
    }

    @Test
    public void testMany2one(){
        //@param of method 1:create() script print the DDL to the console
        //@param of method 2:create() export export the script to the database
        new SchemaExport(new Configuration().configure()).create(true, true);
   }

    @AfterClass
    public static void afterClass(){
        if (sf != null) {
            sf.close();
        }
    }

}
