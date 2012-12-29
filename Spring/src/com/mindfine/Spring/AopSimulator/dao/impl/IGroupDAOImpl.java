package com.mindfine.Spring.AopSimulator.dao.impl;

import com.mindfine.Spring.AopSimulator.dao.IGroupDAO;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-29
 * Time: 上午11:35
 */
public class IGroupDAOImpl implements IGroupDAO{

    @Override
    public void delGroup(int groupId) {
        System.out.println("IGroupDAOImpl 已经删除ID为<" + groupId + ">的组.");
    }
}