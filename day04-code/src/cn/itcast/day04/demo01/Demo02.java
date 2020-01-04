package cn.itcast.day04.demo01;

public class Demo02 {
    public static void main(String[] args) {
         int c;
         c=sum(3,79);
         c+=100;
        System.out.println(c);
    }
    public static int sum(int a, int b)
    {
        System.out.println("======方法执行了");
        int result= a+ b;
        return result;
    }
}
