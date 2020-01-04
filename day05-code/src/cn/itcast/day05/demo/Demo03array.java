package cn.itcast.day05.demo;

/*
用数组进行方法得多个结果返回
 */

public class Demo03array {

    public static void main(String[] args) {
        int[] result =  Methodreturn(3,9,60);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] Methodreturn(int a, int b, int c)
    {
        int sum= a+b+c;
        int avg = sum/3;

        int[] result =  {sum, avg};
        return   result;
    }

}
