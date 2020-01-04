package cn.itcast.day10.demo02;

public interface Interface {

    public default void method(){
        System.out.println("接口默认方法");
    }

}
