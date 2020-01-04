package cn.itcast.day06.Demo02;

public class Demo04 {

    public static void main(String[] args) {
        phone one =new phone();
        System.out.println(one);
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("======");

        one.brand ="xiaomi";
        one.color = "white";
        one.price =1999;
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        one.messge(124314);
        one.call("fahdkh");

        System.out.println("===========");

        phone two = one;
        System.out.println(two);
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("======");

        two.brand ="vivo";
        two.color = "pink";
        two.price =2999;
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        two.messge(124314);
        two.call("fahdkh");
    }

}
