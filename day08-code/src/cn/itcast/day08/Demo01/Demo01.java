package cn.itcast.day08.Demo01;

public class Demo01 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = { 'h' , 'e', 'l', 'l', 'o'};
        String str3 = new String (charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str1.equals("hello"));
        System.out.println("hello".equals(str3));
        System.out.println("==========");

        String str4 = "Hello";
        System.out.println(str4.equals(str1));
        System.out.println(str4.equals("Hello"));
        System.out.println("Hello" .equals(str4));

    }

}
