package cn.itcast.day10.demo01;

public interface MyInterfacePrivateA {

    public default void method1 (){
        System.out.println("这是一个默认方法1");
        comment();
    }
    public default void methd2(){
        System.out.println("这是一个默认方法2");
        comment();
    }
    private   void comment(){                     //解决重复代码问题。private 使得comment不能被外部访问
        System.out.println("AAA");
        System.out.println("bbb");
        System.out.println("ccc");
    }

}
