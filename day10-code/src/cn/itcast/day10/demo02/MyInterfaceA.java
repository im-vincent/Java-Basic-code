package cn.itcast.day10.demo02;

public interface MyInterfaceA {

    public abstract void MethodA();

    public abstract void MethodAbs();

    public default void Method(){
        System.out.println("默认方法AAA");
    }

}
