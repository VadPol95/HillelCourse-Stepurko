package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.awt.*;

public class SpringTestRunner {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("mvn/SpringExampleXml/src/resources/spring-bean.xml");

        Object obj1 = context.getBean("test");
        Thread.sleep(5000);
        Object obj2 = context.getBean("test");
        Thread.sleep(5000);
        Object obj3 = context.getBean("test1");

        ((Test) obj1).print();
        ((Test) obj2).print();
        ((Test) obj3).print();

        }

}
