package cn.itcast.day08.Demo05Study;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大字符串");
        String big = sc.next();
        System.out.println("请输入小字符串");
        String small = sc.next();
        int count = 0 ;
        count  = getcount(big, small);
        System.out.println(count);

    }
    public static int getcount(String big , String small){
        int index = 0;
        int count  = 0;
        while ((index = big.indexOf(small, index)) != -1) {
            index++;
            count++;
        }

        return count ;
    }

}
