package cn.itcast.day06.Demo03;

import java.sql.SQLOutput;

public class Student {

    String name ;
    private    int num;
    private  int age;
    private boolean male;

    public void setMale(boolean male){
        this.male=male;
    }

    public boolean isMale(){
        return male;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public int getNum(){
        return num;
    }
}
