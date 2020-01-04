package cn.itcast.day10.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {

    @Override
    public void meteod(){
        System.out.println("实现了抽象方法 ， BBB");
    }

    public void methodDefault(){
        System.out.println("重写默认方法");
    }
}
