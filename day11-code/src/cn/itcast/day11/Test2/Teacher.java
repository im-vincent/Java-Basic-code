package cn.itcast.day11.Test2;

import java.util.ArrayList;

public class Teacher {

    private String name;

    public  void methodCome(){

    }

    public void dianming(ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if(  ! student.getName().equals("李四")){
                student.setCome(true);
            }
        }
    }

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
