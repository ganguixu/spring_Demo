package com.ggx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Enumeration;
import java.util.Properties;

public class Main {

    public static ApplicationContext ctx ;

    static{
        /**
         * spring初始化的两种方式，读取配置文件，创建对象
         * ClassPathXmlApplicationContext 默认是classpath: 为根路径; 也就是编译之后的classes下
         * FileSystemXmlApplicationContext 是项目为根路径，编译之前的路径
         *
         * 总结：
         * file:代表从系统路径下寻找
         * classpath:代表从编译之后的classes文件下去找
         * 不写：采用默认方式
         *  classPathXmlApplicationContext  默认方式classpath
         *  FileSystemXmlApplicationContext 默认从项目根目录下找
         *
         */
        ctx = new ClassPathXmlApplicationContext("spring-Application.xml");
//        ctx = new FileSystemXmlApplicationContext("demo/src/main/resources/spring-Application.xml");
    }

    public static void main(String[] args) {
        Ggx ggx = (Ggx) ctx.getBean("ggx");

        System.out.println(ggx.toString());

        Properties conf = ggx.getConf();
        Enumeration enumeration = conf.propertyNames();
        while (enumeration.hasMoreElements()){
            String key = (String) enumeration.nextElement();
            String value = conf.getProperty(key);
            System.out.println(key+"..."+value);
        }
//        System.out.println(ggx.getName()+":"+ggx.getAge()+":"+ggx.getTest()+":"+ggx.getCar().getCarType()+":"+ggx.getCar().getCarAge());
    }
}
