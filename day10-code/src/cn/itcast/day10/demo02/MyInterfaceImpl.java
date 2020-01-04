package cn.itcast.day10.demo02;

import java.sql.SQLOutput;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    @Override
    public void MethodA() {
        System.out.println("覆盖重写A方法");
    }

    @Override
    public void MethodB() {
        System.out.println("覆盖重写B方法");
    }

    @Override
    public void MethodAbs() {
        System.out.println("覆盖重写了ＡＢ都有的抽象方法");
    }

    @Override
    public void Method() {
        System.out.println("对冲突方法进行覆盖重写");
    }
}
