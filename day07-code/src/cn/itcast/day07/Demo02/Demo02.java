package cn.itcast.day07.Demo02;

/*
匿名输入得两种不同方法
 */

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        MethodParm(new Scanner(System.in));

        Scanner sc = MethodReturn();
        int num = sc.nextInt();
        System.out.println("second num :" + num);

    }

    public static void MethodParm(Scanner sc){
        int num = sc.nextInt();

        System.out.println("first num = " +num);
        System.out.println("============");
    }

    public static Scanner MethodReturn(){
        return new Scanner(System.in);
    }

}
