package com.tutorial;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by Arpan on 11/12/17.
 */
public class Client {
    public static void main(String[] args) {

//        Employee e = new Employee();
//        e.setEmpID(12);
//        e.setName("arpan");
//        System.out.println(e);

        Resource resource = new ClassPathResource("SpringContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Employee e1 = (Employee)factory.getBean("emp1");

        System.out.println(e1);


        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
      //  Employee e2 = (Employee)context.getBean("emp2");
     //   System.out.println(e2);

    }
}
