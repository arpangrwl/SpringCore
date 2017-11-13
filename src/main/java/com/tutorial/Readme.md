

Spring Core tutorial
---------------------

Resource resource = new ClassPathResource("SpringContext.xml");
BeanFactory factory = new XmlBeanFactory(resource);


BeanFactory is represented by org.springframework.beans.factory.BeanFactory interface.It is the main and the basic  way to access the Spring container.Other ways to access the spring container such as ApplicationContext,ListableBeanFactory, ConfigurableBeanFactory etc. are built upon this BeanFactory interface (extends/implements BeanFactory interface).

BeanFactory interface provides basic functionality for the Spring Container like:

1)It provides DI / IOC mechanism for the Spring.

2)It is built upon Factory Design Pattern.

3)It loads the beans definitions and their property descriptions from some configuration source (for example, from XML configuration  file) .

4)Instantiates the beans when they are requested like beanfactory_obj.getBean("beanId").

5)Wire dependencies and properties for the beans according to their configuration defined in configuration source while instantiating the beans.

6)Manage the bean life cycle by bean lifecycle interfaces and calling initialization and destruction methods.

(Note that BeanFactory does not create the objects of beans immediately when it loads the configuration for beans from configuration source.Only bean definitions and their property descriptions are loaded. Beans themselves are instantiated  and their properties are set only when they are requested such as by getBean() method.)

BeanFactory Implementations:

The most important BeanFactory implementation is –org.springframework.beans.factory.xml.XmlBeanFactory.It reads bean definitions from an XML file.

Constructor for XmlBeanFactory:

XmlBeanFactory(Resource resource)

Example1:


BeanFactory bfObj = new XmlBeanFactory(new FileSystemResource ("c:/beansconfig.xml"));

MyBean beanObj= (MyBean) bfObj.getBean("mybean");


In above code BeanFactory object bfObj is representing a Spring IOC container.

XmlBeanFactory constructor takes an implementation of Resource interface as an argument.
Here we have used FileSystemResource which is one of the implementations of Resource interface.

The Resource interface has many implementaions. Two mainly used are:

1)org.springframework.core.io.FileSystemResource:
              Loads the resource from underlying file system.

2)org.springframework.core.io.ClassPathResource:
              Loads the resource from classpath(shown below).

Purpose of FileSystemResource is to provide the xml file with the given name from underlying file system to XmlBeanFactory.

Now,  bfObj represents a Spring Container which has loaded the bean definitions from the beansconfig.xml file.

At this point only beans definitions got loaded but bean themselves are not instantiated yet.

At the second line,

MyBean beanObj = (MyBean) bfObj.getBean("mybean");

We are requesting from spring container a bean with id "mybean". BeanFactory will read bean definition of a bean with id "mybean" from beansconfig.xml file, instantiates it and return a reference to that. Thus BeanFactory loads the beans lazily.

Example2:


ClassPathResource resorce = new ClassPathResource ("beansconfig.xml");

BeanFactory factory = new XmlBeanFactory(resource);


Example3:


ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
        new String[] {"applicationContext.xml", "applicationContext-part2.xml"});

// an ApplicationContext is also  a BeanFactory.
BeanFactory factory = (BeanFactory) appContext;


Example4:

BeanFactory factory = new XmlBeanFactory(new FileInputStream("beansconfig.xml"));???

Note: BeanFactory is not recomended for use in latest Spring versions. It is there only for backward compatability. ApplicationContext is preferred over this because ApplicationContext provides more advance level features which makes an application enterprise level application.


