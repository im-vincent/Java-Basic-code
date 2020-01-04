package cn.itcast.day10.demo01;

public interface MyInterfaceDefault {

    public abstract void  meteod();


    public default  void methodDefault(){
        System.out.println("新添加的默认方法");
    }
}
