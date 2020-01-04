package cn.itcast.day11.Test5;

import cn.itcast.day11.demo05.Weapon;

public class DemoMain {

    public static void main(String[] args) {

        Worker worker = new Worker();

        Apple a1 = new Apple(5 ,"青色", "甜的") ;
        Apple a2 = new Apple(3 ,"红色","苦涩");

        System.out.println("默认挑大得");
        Apple apple = worker.pickApple(new Compare(),a1,a2);

        System.out.println(apple);

        System.out.println("默认挑红得");

        Apple a3 = worker.pickApple(new Compare(){           //作为内部类，重新覆盖原方法
            @Override
            public Apple compare(Apple a1, Apple a2){
                return "红色".equals(a1.getColor()) ? a1 : a2;
            }
        }, a1, a2);
        System.out.println(a3);

        System.out.println("默认挑甜的");

        Apple apple1 = worker.pickApple(new Compare(){               //内部类，实现方法重新构造
            @Override
            public Apple compare( Apple a1 , Apple a2){
                return "甜的".equals(a1.getTaste()) ? a1: a2;
            }
        },a1, a2);
        System.out.println(apple1);


    }

}
