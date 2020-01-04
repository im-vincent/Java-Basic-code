package cn.itcast.day10.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {
    public void meth(){
//        comment();      //报错，表示不能访问
        method1();
        methd2();
    }
}
