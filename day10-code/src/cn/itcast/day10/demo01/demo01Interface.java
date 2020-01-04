package cn.itcast.day10.demo01;

public class demo01Interface {

    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.meteod();
        a.methodDefault();
        System.out.println("===========");

        MyInterfaceDefaultB  b = new MyInterfaceDefaultB();
        b.meteod();
        b.methodDefault();
    }

}
