package com.mindfine.hibernate.orMapping.VO;

import org.junit.Test;

import java.util.Set;

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

        topNode.setLevel(0);
        l1Node1.setpTree(topNode);
        l1Node1.setLevel(1);
            l1Node1l2Node1.setpTree(l1Node1);
            l1Node1l2Node1.setLevel(2);
                l1Node1l2Node1l3Node1.setpTree(l1Node1l2Node1);
                l1Node1l2Node1l3Node1.setLevel(3);
                l1Node1l2Node1l3Node2.setpTree(l1Node1l2Node1);
                l1Node1l2Node1l3Node2.setLevel(3);
            l1Node1l2Node2.setpTree(l1Node1);
            l1Node1l2Node2.setLevel(2);
                l1Node1l2Node2l3Node1.setpTree(l1Node1l2Node2);
                l1Node1l2Node2l3Node1.setLevel(3);
                l1Node1l2Node2l3Node2.setpTree(l1Node1l2Node2);
                l1Node1l2Node2l3Node2.setLevel(3);
            l1Node1l2Node3.setpTree(l1Node1);
            l1Node1l2Node3.setLevel(2);
                l1Node1l2Node3l3Node1.setpTree(l1Node1l2Node3);
                l1Node1l2Node3l3Node1.setLevel(3);
                l1Node1l2Node3l3Node2.setpTree(l1Node1l2Node3);
                l1Node1l2Node3l3Node2.setLevel(3);
                l1Node1l2Node3l3Node3.setpTree(l1Node1l2Node3);
                l1Node1l2Node3l3Node3.setLevel(3);
                l1Node1l2Node3l3Node4.setpTree(l1Node1l2Node3);
                l1Node1l2Node3l3Node4.setLevel(3);
        l1Node2.setpTree(topNode);
        l1Node2.setLevel(1);
            l1Node2l2Node1.setpTree(l1Node2);
            l1Node2l2Node1.setLevel(2);
                l1Node2l2Node1l3Node1.setpTree(l1Node2l2Node1);
                l1Node2l2Node1l3Node1.setLevel(3);
                l1Node2l2Node1l3Node2.setpTree(l1Node2l2Node1);
                l1Node2l2Node1l3Node2.setLevel(3);
            l1Node2l2Node2.setpTree(l1Node2);
            l1Node2l2Node2.setLevel(2);
                l1Node2l2Node2l3Node1.setpTree(l1Node2l2Node2);
                l1Node2l2Node2l3Node1.setLevel(3);
                l1Node2l2Node2l3Node2.setpTree(l1Node2l2Node2);
                l1Node2l2Node2l3Node2.setLevel(3);
            l1Node2l2Node3.setpTree(l1Node2);
            l1Node2l2Node3.setLevel(2);
                l1Node2l2Node3l3Node1.setpTree(l1Node2l2Node3);
                l1Node2l2Node3l3Node1.setLevel(3);
        l1Node3.setpTree(topNode);
        l1Node3.setLevel(1);
            l1Node3l2Node1.setpTree(l1Node3);
            l1Node3l2Node1.setLevel(2);
            l1Node3l2Node2.setpTree(l1Node3);
            l1Node3l2Node2.setLevel(2);
            l1Node3l2Node3.setpTree(l1Node3);
            l1Node3l2Node3.setLevel(2);
            l1Node3l2Node4.setpTree(l1Node3);
            l1Node3l2Node4.setLevel(2);

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

    /**
     * “拿出一个节点，然后输出他的所有子节点。
     * ”拿出所有一级节点。
     */
    @Test
    public void testGetNodeChild(){
        session.beginTransaction();
        Exercise_2_Tree nodeSingle = (Exercise_2_Tree)session.get(Exercise_2_Tree.class, 14);//l1Node2节点
        getChilds(nodeSingle);
    }
    public void getChilds(Exercise_2_Tree node){
        String s = "";
        for(int i=0; i<node.getLevel(); i++){
            s += "----";
        }
        System.out.println(s + node.getBody());
        Set<Exercise_2_Tree> nodeSet = node.getcTreeSet();
        for(Exercise_2_Tree leaf : nodeSet){
            getChilds(leaf);
        }
    }


}
