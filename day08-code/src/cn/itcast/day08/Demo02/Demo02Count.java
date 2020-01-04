package cn.itcast.day08.Demo02;

import java.util.Scanner;

public class Demo02Count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] charArray = input.toCharArray();
        int countLock = 0;
        int countSmall =0;
        int countNum = 0;
        int countOther = 0;
        for (int i = 0; i < charArray.length; i++) {
            char ch= charArray[i];
            if('A' <= ch  && ch <= 'Z'){
                countLock++;
            }
            else if('a' <=ch   && ch <= 'z'){
                countSmall++;
            }
            else if(  '0' <= ch  && ch<= '9'){
                countNum++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母" + countLock);
        System.out.println("小写字母： " + countSmall);
        System.out.println("数字有： " +countNum);
        System.out.println("其他有： " + countOther);
    }

}
