package cn.itcast.day04.demo01;

public class Demo05 {
    public static void main(String[] args) {
        hello(19);
    }

    public static void hello(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("hello world" +(i+1));
        }
    }

}
