package cn.itcast.day08.Demo05Study;

import java.util.ArrayList;
import java.util.Random;

public class Demo01Test1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String str =  RandomReturn();
            System.out.println("产生为:" +str);

            String str2 = reverseStr(str);
            System.out.println("反转后：" + str2);
        }
    }

    public static String RandomReturn(){
        Random r = new Random();
        String str ="";
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < 6; i++) {
            int index = r.nextInt(arr.length);
            str  = str + arr[index];
        }
        return str;
    }

    public static String reverseStr(String  str){
        String s = "";
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            s = s + chars[i];
        }
        return s;
    }

}
