package cn.itcast.day11.demo03;

public class Outer {

    public void method(){                  //局部内部类
        class Inner{                        //在局部内部类中， Inner Class前面什么都不能写
           int num =10;
           public void methodInner(){
               System.out.println(num);
           }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }

}
