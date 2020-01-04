package cn.itcast.day08.Demo05Study;

import java.util.Scanner;

public class Demo02Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String qq = sc.next();
        boolean a = check(qq);
        System.out.println(a);
    }

    public static boolean check(String qq){
        if(qq.length()<5 || qq.length()>12){
            return false;
        }
        if(qq.charAt(0) == '0'){
            return false;
        }
        char[] chars = qq.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch= chars[i];
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;

    }

}
