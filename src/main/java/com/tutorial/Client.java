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

        Employee e1 = (Employee)factory.getBean("emp2");

        System.out.println(e1);


        /*----------------------------
         <!-- Constructor Setting up  -->
         <bean id="addConst" class="com.tutorial.Address">
            <constructor-arg type="java.lang.String" value="Shyamnagar" />
            <constructor-arg type="int" value="51"/>
         </bean>
         -----------------------------*/
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
        Address address = (Address)context.getBean("addConst1");
        System.out.println(address);


        /*----------------------------

    <bean id="addConst2" class="com.tutorial.Address">
        <constructor-arg index="0" value="Shyamnagar" />
        <constructor-arg index="1" value="51"/>
    </bean>
        ---------------------------- */
        ApplicationContext context1 = new ClassPathXmlApplicationContext("SpringContext.xml");
        Address address1 = (Address)context.getBean("addConst2");
        System.out.println(address1);
    }
}
