package cn.itcast.day07.Demo02;

/*
匿名对象创建
 */

public class Demo01 {

    public static void main(String[] args){

        Person one = new Person();
        one.name =" 马云";
        one.showName();

        new Person().name= "张222";
    }


}
