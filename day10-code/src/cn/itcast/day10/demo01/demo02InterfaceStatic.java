package cn.itcast.day10.demo01;

public class demo02InterfaceStatic {

    public static void main(String[] args) {

        MyInterfaceStaticImpl  m  = new MyInterfaceStaticImpl();
       // m.methodStatic();              //错误写法

        MyInterfaceStatic.methodStatic();     //要调用静态接口方法，可以直接调用
    }

}
