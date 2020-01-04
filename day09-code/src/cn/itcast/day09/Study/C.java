package cn.itcast.day09.Study;

public class C extends B {
    int numc = 30 ;

    public void showC(){
        System.out.println(numc);
    }
    @Override
    public void showA(){
        System.out.println(numa);
    }

     @Override
    public void showB(){
         System.out.println(numb);
     }
}
