package cn.itcast.day06.Demo02;

public class DemoPhone {
    public static void main(String[] args) {

        phone pho =new phone();

        System.out.println(pho.brand);
        System.out.println(pho.color);
        System.out.println(pho.price);
        System.out.println("=====");

        pho.brand =" 苹果";
        pho.color = "黑色";
        pho.price = 4903.0;
        System.out.println(pho.brand);
        System.out.println(pho.color);
        System.out.println(pho.price);
        pho.messge(1234432);
        pho.call("zzk");

    }

}
