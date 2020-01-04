package cn.itcast.day10.Test4;

public class B implements A {

    @Override
    public void showA() {
        System.out.println("重写showA方法");
    }
    public static void showD(){
        System.out.println("B类中静态方法showD");
    }
}
