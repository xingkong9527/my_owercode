package com.ownClass;

public class Student {
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void say(){
        System.out.println("我叫"+ name);
    }
}
