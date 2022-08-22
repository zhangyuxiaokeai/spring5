package com.atguigu.spring5.bean;

/**
 * @author shkstart
 * @create 2022-07-28 20:52
 */
public class Orders {


    public Orders() {
        System.out.println("第一步执行无参构造器");
    }

    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二部：执行set方法");
    }
    //创建执行初始化的方法
    public void initMethod(){
        System.out.println("执行初始化的方法");
    }

    //创建销毁的方法
    public void detroyMethod(){
        System.out.println("第五步执行销毁的方法");
    }
}
