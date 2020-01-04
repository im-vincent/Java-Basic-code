package cn.itcast.day04.demo01;

public class Demo03 {
    public static void main(String[] args)
    {
       wu(12,45);
        System.out.println("======");
        you();
    }

    public static void wu(int a, int b){
        int res=a*b;
        System.out.println(res);
    }

    public static void you(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello    " +i);
        }
    }
}
