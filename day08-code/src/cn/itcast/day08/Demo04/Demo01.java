package cn.itcast.day08.Demo04;

public class Demo01 {

    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(5.3));
        System.out.println(Math.abs(-5.9));
        System.out.println("===========");

        //向上取整
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.ceil(5.9));
        System.out.println(Math.ceil(5.0));
        System.out.println("=======");

        //向下取整
        System.out.println(Math.floor(8.9));
        System.out.println(Math.floor(8.1));
        System.out.println(Math.floor(9.0));
        System.out.println("==========");

        //3.14
        System.out.println(Math.PI);
        System.out.println("=========");

        //四舍五入
        System.out.println(Math.round(5.4));
        System.out.println(Math.round(5.5));

    }

}
