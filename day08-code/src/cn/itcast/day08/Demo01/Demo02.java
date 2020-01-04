package cn.itcast.day08.Demo01;

public class Demo02 {

    public static void main(String[] args) {
        String str1 = "hellosdafdfdsaf324432";
        System.out.println("字符长度是: " +str1.length());
        System.out.println("=====");

        String str2 = "hello ";
        String str3 = "world";
        System.out.println(str2);
        System.out.println(str3);

        String str4 = str2.concat(str3);
        System.out.println("拼接后的字符串为： " +str4);
        System.out.println("===========");

        char ch = "hlkhhhlh".charAt(4);
        System.out.println("ch 4号的索引值为： " +ch);
        System.out.println("============");

        String str5 = "helloWorld";
        int index = str5.indexOf("o");
        System.out.println("首次出现的位置为："  + index);
        int index2 = str5.indexOf("t");
        System.out.println("首次出现的位置为："  + index2);//不存在则返回值为-1


    }

}
