package cn.itcast.day06.Demo02;

public class Demo03 {

    public static void main(String[] args) {
         phone two = new phone();
         two = getPhone();
        System.out.println(two);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.brand);
        two.messge(1243214);
         two.call("mac");

    }

    public static phone getPhone(){
        phone one = new phone();
        one.price = 4989;
        one.color = "black";
        one.brand = "Apple";
        System.out.println(one+"=====");
        return one;
    }

}
