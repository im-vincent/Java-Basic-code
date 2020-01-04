package cn.itcast.day09.Demo03;

public class Zi extends Fu {

     public  Zi(){
        super();
    }

    int num ;
     public void show(){
         System.out.println(super.num);
         super.show();
     }

}
