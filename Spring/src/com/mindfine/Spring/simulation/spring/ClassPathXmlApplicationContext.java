package com.mindfine.Spring.simulation.spring;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-24
 * Time: 上午11:06
 */
public class ClassPathXmlApplicationContext implements BeanFactory {
    Map<String, Object> beanMap = new HashMap<String, Object>();

    public ClassPathXmlApplicationContext() throws Exception{
        SAXBuilder saxBuilder = new SAXBuilder();
        Document xmlDoc = saxBuilder.build(this.getClass().getClassLoader().getResourceAsStream("beans.xml"));
        Element root = xmlDoc.getRootElement();
        List<Element> childrenList = root.getChildren();
        for(Element bean : childrenList){
            String beanId = bean.getAttributeValue("id");
            String beanClassStr = bean.getAttributeValue("class");
            try {
                Object beanObject = Class.forName(beanClassStr).newInstance();
                beanMap.put(beanId, beanObject);
            } catch (ClassNotFoundException e) {
System.out.println("class " + beanClassStr + " not found.");
            }
        }
System.out.println(beanMap.size() + " bean loaded.");
    }

    @Override
    public Object getBean(String beanId) {
        return beanMap.get(beanId);
    }
}
