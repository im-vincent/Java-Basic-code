package cn.itcast.day10.Test1;

public interface A {

    public  abstract  void showA();

    public default void showB(){
        System.out.println("默认方法showB");
    }


}
