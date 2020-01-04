package cn.itcast.day08.Demo01;

public class Demo04 {

    public static void main(String[] args) {
        char[] ch = "Hello".toCharArray();
        System.out.println("拆分后的返回为："+ch[3]);
        System.out.println("字符串长度为："+ch.length);
        System.out.println("=========");

        byte[] b = "abcdef".getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println("返回的字符字节数为： "+ b[i]);
        }
        System.out.println("============");

        String str = "are you ok ";
        String str2 = str.replace("o" ,"*");
        System.out.println("替换后为： " +str2);

    }
}
