package com.atguigu.spring5.tetsDemo;

import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectionType.Book;
import com.atguigu.spring5.collectionType.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-07-28 17:40
 */
public class TestSpring5Demo {
    @Test
    public void testCollectionTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = (Stu)context.getBean("stu",Stu.class);
        System.out.println(stu);
    }

    @Test
    public void testCollectionTest2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book stu = (Book)context.getBean("book", Book.class);
        System.out.println(stu);
    }

    @Test
    public void beanTest3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders stu = (Orders)context.getBean("orders", Orders.class);
        System.out.println("获取bean实例对象");
        System.out.println(stu);
        ((ClassPathXmlApplicationContext) context).close();
    }


    @Test
    public void autoBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = (Emp)context.getBean("emp", Emp.class);
        System.out.println(emp);

    }
}
