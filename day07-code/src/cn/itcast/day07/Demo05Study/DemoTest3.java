package cn.itcast.day07.Demo05Study;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DemoTest3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(12);
        list.add(34);
        list.add(23);
        list.add(78);
        list.add(90);
        System.out.println("请输入要查找得元素： ");

        int num = sc.nextInt();
        int index = findIndex(num , list);
        System.out.println("返回引索为： " +index);

        System.out.println("请输入需要替换数字：  ");
        int num2= sc.nextInt();
        replace(index , list , num2);
    }

    public static int findIndex(int num , ArrayList<Integer> list){
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
           if(num == list.get(i)){
               break;
           }
            index++;
        }
        return index;
    }

    public static void replace(int index , ArrayList<Integer> list ,int num2){
        for (int i = 0; i < list.size(); i++) {
            if(i == index){
                list.remove(i);
                 list.add(i , num2);
            }

        }
        System.out.println("替换后为： " + list);
    }
}
