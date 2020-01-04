package cn.itcast.day07.Demo05Study;


import java.util.ArrayList;
import java.util.Scanner;

public class DemoTest2 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. 录入信息  ; 0. 取消");
            int num = sc.nextInt();
            switch (num){
                case 0: {
                    System.out.println("录入完毕！！！");
                    break;
                }
                case 1: {
                    putStudent(list , sc);
                }
            }
            if(num == 0){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("name : " + stu.getName() + "   age:  " +stu.getAge());
        }
    }

    public static void putStudent(ArrayList<Student> list , Scanner sc){
        System.out.println("请输入姓名： ");
        String name = sc.next();
        System.out.println("请输入年龄 ：");
        int age = sc.nextInt();
        Student stu = new Student(name, age);
        list.add(stu);
    }

}
