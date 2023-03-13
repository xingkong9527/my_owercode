package com.reflex;

import com.ownClass.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflex {
    public static void main(String[] args) {

        Student my = new Student("guo",12);
        my.say();
        System.out.println("=========================");

        /**
         * 如果我想修改Student类的名字（私有）
         */
        try {
            /**
             * 通过类路径获取反射类对象,推荐
             */
            Class myClass = Class.forName("com.ownClass.Student");

            /**
             * 暴力反射，私有修改名字
             * 1.获取字段
             * 2.设置访问权限（因为是私有属性）
             */
            Field Sname = myClass.getDeclaredField("name");
            Sname.setAccessible(true);
            Sname.set(my,"zhangsan");

            /**
             * 反射法执行函数
             */
            Method Ssay = myClass.getMethod("say");
            Ssay.invoke(my);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
