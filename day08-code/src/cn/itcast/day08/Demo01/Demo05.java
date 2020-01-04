package cn.itcast.day08.Demo01;

public class Demo05 {

    public static void main(String[] args) {
        String str1 = "aa,bbb,cccc,dddd";
        String [] arr = str1.split(",");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("========");

        String str3 = "aa bbb cccc dddd";
        String [] arr2 = str3.split(" ");
        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("===========");

        String str4 = "aa.bbb.cccc.dddd";
        String [] arr3 = str4.split("\\.");     //【这里必须加上\\.  】
        System.out.println(arr3.length);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }

}
