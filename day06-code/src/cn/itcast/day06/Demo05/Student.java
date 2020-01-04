/*
构造方法:  有参   与 无参
 */

package cn.itcast.day06.Demo05;

public class Student {

   private String name;
    private int age;

    public Student(){
        System.out.println("无参构造方法");
    }

    public Student( String name , int age){
        System.out.println("有参构造方法开始了");
        this.name= name;
        this.age = age;

    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }

}
