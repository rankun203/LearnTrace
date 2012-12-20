package com.mindfine.hibernate.orMapping.VO;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-15
 * Time: 下午11:37
 */
public class TestMany2many extends SuperTest{

    @Test
    public void testMany2many(){
        new SchemaExport(new Configuration().configure()).create(true, true);
    }
}
