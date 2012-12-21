package com.mindfine.hibernate.orMapping.VO;

import org.junit.Test;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-21
 * Time: 上午10:24
 */
public class Exercise_2_TreeOpr extends SuperTest{

    /**
     * ”向树中插入数据
     */
    @Test
    public void testTreeInit(){
        session.beginTransaction();

        Exercise_2_Tree topNode = new Exercise_2_Tree("topNode");
        Exercise_2_Tree l1Node1 = new Exercise_2_Tree("l1Node1");
            Exercise_2_Tree l1Node1l2Node1 = new Exercise_2_Tree("l1Node1l2Node1");
                Exercise_2_Tree l1Node1l2Node1l3Node1 = new Exercise_2_Tree("l1Node1l2Node1l3Node1");
                Exercise_2_Tree l1Node1l2Node1l3Node2 = new Exercise_2_Tree("l1Node1l2Node1l3Node2");
            Exercise_2_Tree l1Node1l2Node2 = new Exercise_2_Tree("l1Node1l2Node2");
                Exercise_2_Tree l1Node1l2Node2l3Node1 = new Exercise_2_Tree("l1Node1l2Node2l3Node1");
                Exercise_2_Tree l1Node1l2Node2l3Node2 = new Exercise_2_Tree("l1Node1l2Node2l3Node2");
            Exercise_2_Tree l1Node1l2Node3 = new Exercise_2_Tree("l1Node1l2Node3");
                Exercise_2_Tree l1Node1l2Node3l3Node1 = new Exercise_2_Tree("l1Node1l2Node3l3Node1");
                Exercise_2_Tree l1Node1l2Node3l3Node2 = new Exercise_2_Tree("l1Node1l2Node3l3Node2");
                Exercise_2_Tree l1Node1l2Node3l3Node3 = new Exercise_2_Tree("l1Node1l2Node3l3Node3");
                Exercise_2_Tree l1Node1l2Node3l3Node4 = new Exercise_2_Tree("l1Node1l2Node3l3Node4");
        Exercise_2_Tree l1Node2 = new Exercise_2_Tree("l1Node2");
            Exercise_2_Tree l1Node2l2Node1 = new Exercise_2_Tree("l1Node2l2Node1");
                Exercise_2_Tree l1Node2l2Node1l3Node1 = new Exercise_2_Tree("l1Node2l2Node1l3Node1");
                Exercise_2_Tree l1Node2l2Node1l3Node2 = new Exercise_2_Tree("l1Node2l2Node1l3Node2");
            Exercise_2_Tree l1Node2l2Node2 = new Exercise_2_Tree("l1Node2l2Node2");
                Exercise_2_Tree l1Node2l2Node2l3Node1 = new Exercise_2_Tree("l1Node2l2Node2l3Node1");
                Exercise_2_Tree l1Node2l2Node2l3Node2 = new Exercise_2_Tree("l1Node2l2Node2l3Node2");
            Exercise_2_Tree l1Node2l2Node3 = new Exercise_2_Tree("l1Node2l2Node3");
                Exercise_2_Tree l1Node2l2Node3l3Node1 = new Exercise_2_Tree("l1Node2l2Node3l3Node1");
        Exercise_2_Tree l1Node3 = new Exercise_2_Tree("l1Node3");
            Exercise_2_Tree l1Node3l2Node1 = new Exercise_2_Tree("l1Node3l2Node1");
            Exercise_2_Tree l1Node3l2Node2 = new Exercise_2_Tree("l1Node3l2Node2");
            Exercise_2_Tree l1Node3l2Node3 = new Exercise_2_Tree("l1Node3l2Node3");
            Exercise_2_Tree l1Node3l2Node4 = new Exercise_2_Tree("l1Node3l2Node4");

        l1Node1.setpTree(topNode);
            l1Node1l2Node1.setpTree(l1Node1);
                l1Node1l2Node1l3Node1.setpTree(l1Node1l2Node1);
                l1Node1l2Node1l3Node2.setpTree(l1Node1l2Node1);
            l1Node1l2Node2.setpTree(l1Node1);
                l1Node1l2Node2l3Node1.setpTree(l1Node1l2Node2);
                l1Node1l2Node2l3Node2.setpTree(l1Node1l2Node2);
            l1Node1l2Node3.setpTree(l1Node1);
                l1Node1l2Node3l3Node1.setpTree(l1Node1l2Node3);
                l1Node1l2Node3l3Node2.setpTree(l1Node1l2Node3);
                l1Node1l2Node3l3Node3.setpTree(l1Node1l2Node3);
                l1Node1l2Node3l3Node4.setpTree(l1Node1l2Node3);
        l1Node2.setpTree(topNode);
            l1Node2l2Node1.setpTree(l1Node2);
                l1Node2l2Node1l3Node1.setpTree(l1Node2l2Node1);
                l1Node2l2Node1l3Node2.setpTree(l1Node2l2Node1);
            l1Node2l2Node2.setpTree(l1Node2);
                l1Node2l2Node2l3Node1.setpTree(l1Node2l2Node2);
                l1Node2l2Node2l3Node2.setpTree(l1Node2l2Node2);
            l1Node2l2Node3.setpTree(l1Node2);
                l1Node2l2Node3l3Node1.setpTree(l1Node2l2Node3);
        l1Node3.setpTree(topNode);
            l1Node3l2Node1.setpTree(l1Node3);
            l1Node3l2Node2.setpTree(l1Node3);
            l1Node3l2Node3.setpTree(l1Node3);
            l1Node3l2Node4.setpTree(l1Node3);

        session.save(topNode);
            session.save(l1Node1);
                session.save(l1Node1l2Node1);
                    session.save(l1Node1l2Node1l3Node1);
                    session.save(l1Node1l2Node1l3Node2);
                session.save(l1Node1l2Node2);
                    session.save(l1Node1l2Node2l3Node1);
                    session.save(l1Node1l2Node2l3Node2);
                session.save(l1Node1l2Node3);
                    session.save(l1Node1l2Node3l3Node1);
                    session.save(l1Node1l2Node3l3Node2);
                    session.save(l1Node1l2Node3l3Node3);
                    session.save(l1Node1l2Node3l3Node4);
            session.save(l1Node2);
                session.save(l1Node2l2Node1);
                    session.save(l1Node2l2Node1l3Node1);
                    session.save(l1Node2l2Node1l3Node2);
                session.save(l1Node2l2Node2);
                    session.save(l1Node2l2Node2l3Node1);
                    session.save(l1Node2l2Node2l3Node2);
                session.save(l1Node2l2Node3);
                    session.save(l1Node2l2Node3l3Node1);
            session.save(l1Node3);
                session.save(l1Node3l2Node1);
                session.save(l1Node3l2Node2);
                session.save(l1Node3l2Node3);
                session.save(l1Node3l2Node4);

        session.getTransaction().commit();
    }
}
