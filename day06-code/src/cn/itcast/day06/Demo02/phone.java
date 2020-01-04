package cn.itcast.day06.Demo02;

public class phone {

    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("给" +who +"打电话");
    }

    public void messge(int num){
        System.out.println("我得号码是" + num);
    }

}
