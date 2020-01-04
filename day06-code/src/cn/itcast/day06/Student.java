package cn.itcast.day06;

public class Student {

    public static void main(String[] args) {
        Demo01 stu = new Demo01();
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("========");

        stu.age = 18;
        stu.name ="笑傲";
        System.out.println(stu.age);
        System.out.println(stu.name);

        stu.study();
        stu.sleep();
        stu.sleep();
    }

}
