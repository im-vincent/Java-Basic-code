package cn.itcast.day08.Demo03;

import java.util.Arrays;

public class Demo01Arrays {

    public static void main(String[] args) {
        //将数组转化为字符串
        int[] num = {1,3,45,45};
        String str1 = Arrays.toString(num);
        System.out.println(str1);
        System.out.println("=========");

        //排序
        int[] arr = {45,9,321,45,46,12,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("=====");

        String[] str2 = {"aaa" ,"ccc", "eee" ,"ddd"};
        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));

        String str3 = "hfakdhglk35";
        char[] chars = str3.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("========");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }


    }

}
