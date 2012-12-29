package com.mindfine.Spring.AopSimulator.common;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: rankun203
 * Date: 12-12-28
 * Time: 上午10:37
 */
public class ClassPathXmlConfLoader {
    private Map<String, Object> beanMap = new HashMap<String, Object>();//装着所有myInterface

    public ClassPathXmlConfLoader() throws Exception {
        SAXBuilder builder = new SAXBuilder();
        Document confTree = builder.build(this.getClass().getClassLoader().getResourceAsStream("proxyDef.xml"));
        Element root = confTree.getRootElement();
        List<Element> interfaces = root.getChildren();
        for(Element secNode : interfaces) {
            if(secNode.getName().equals("myImpl")){
                String eleName = secNode.getAttributeValue("name");
                String eleClass = secNode.getAttributeValue("class");
                Object obj = Class.forName(eleClass).newInstance();
                beanMap.put(eleName, obj);
            }
        }
    }

    public Object getBean(String beanName) {
        return beanMap.get(beanName);
    }
}
