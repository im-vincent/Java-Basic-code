package cn.itcast.day10.Test4;

public class demo  {

    public static void main(String[] args) {
        B b = new B();
        b.showA();

        //不需要new   ， 直接调用
        A.showB10();
        A.showC10();
        B.showD();
    }

}
