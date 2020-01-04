package cn.itcast.day08.Demo01;

public class Demo03 {

    public static void main(String[] args){
        String str1 = "helloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println("截取的值为："+ str2);
        System.out.println("====");

        String str3 = str1.substring(6,9);
        System.out.println("截取值为：" +str3);

    }

}
