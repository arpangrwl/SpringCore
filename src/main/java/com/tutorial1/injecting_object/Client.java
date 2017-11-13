package com.tutorial1.injecting_object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by Arpan on 11/12/17.
 */
public class Client {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("SpringContext1.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Triangle triangle = factory.getBean("triangle", Triangle.class);

        System.out.println(triangle);


        //Inner

        Resource resource1 = new ClassPathResource("SpringInnerRef.xml");
        BeanFactory factory1 = new XmlBeanFactory(resource1);
        Triangle triangle1 = factory1.getBean("triangle", Triangle.class);

        System.out.println(triangle);
    }
}
