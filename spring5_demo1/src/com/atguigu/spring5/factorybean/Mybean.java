package com.atguigu.spring5.factorybean;

import com.atguigu.spring5.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author shkstart
 * @create 2022-07-28 20:20
 */
public class Mybean implements FactoryBean<Course> {


    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
       course.setCourse("sdad");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
