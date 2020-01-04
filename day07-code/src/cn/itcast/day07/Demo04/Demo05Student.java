package cn.itcast.day07.Demo04;

import java.util.ArrayList;

public class Demo05Student {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("迪丽热巴" ,29);
        Student stu2 = new Student("古力娜扎" ,27);
        Student stu3 = new Student("三木" ,28);
        Student stu4 = new Student("奥特曼" ,30);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("name: " + stu.getName() + "age: " + stu.getAge());
        }
    }
}
