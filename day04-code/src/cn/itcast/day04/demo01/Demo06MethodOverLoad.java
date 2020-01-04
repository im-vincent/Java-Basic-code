package cn.itcast.day04.demo01;

public class Demo06MethodOverLoad {
    public static void main(String[] args) {
        System.out.println(sun(10,20));
        System.out.println(sun(10,80,70));
        System.out.println(sun(34,89,34,21));
    }

    public static int sun(int a, int b){
        System.out.println("两个参数");
        return(a+b);
    }

    public static  int sun(int a, int b, int c)
    {
        System.out.println("三个参数");
        return(a+b+c);
    }

    public static int sun(int a,int b, int c, int d)
    {
        System.out.println("四个参数");
        return(a+b+c+d);
    }
}
