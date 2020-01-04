package cn.itcast.day10.demo02;

public interface MyInterfaceB {

    public abstract void MethodB();

    public abstract void MethodAbs();

    public default void Method(){
        System.out.println("默认方法BBB");
    }
}
