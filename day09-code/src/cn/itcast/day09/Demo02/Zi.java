package cn.itcast.day09.Demo02;

public class Zi extends Fu {

    int num = 20 ;
    public void method(){
        int num = 30;
        System.out.println(" 局部"+num);
        System.out.println(" 本类"+this.num);
        System.out.println("父类"+super.num);
    }
}
