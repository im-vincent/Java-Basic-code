package cn.itcast.day10.demo01;

public class demo03InterafcePrivate {

    public static void main(String[] args) {
        MyInterfacePrivateB.method1();
        MyInterfacePrivateB.methd2();
        System.out.println("============");

        MyInterfacePrivateAImpl m = new MyInterfacePrivateAImpl();
        m.meth();
    }

}
