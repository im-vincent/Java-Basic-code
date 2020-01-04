package cn.itcast.day07.Demo05Study;

import java.util.ArrayList;
import java.util.Random;

public class DemoTest4 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = getNumList();
        printCount(numList);
    }

    public static ArrayList<Integer> getNumList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num =  r.nextInt(10)+1;
            list.add(num);
        }
        return list;
    }

    public static void printCount(ArrayList<Integer> numList){
        int count[] =new int[10];
        for (int i = 0; i < numList.size(); i++) {
            int  c = numList.get(i);
            System.out.println(numList.get(i));
            count[c-1]++;
        }
        System.out.println("======");
        for (int i = 0; i < count.length; i++) {
            System.out.println("数字： " + (i+1) + "--" +count[i] +"次");
        }
    }
}
