package cn.itcast.day08.Demo05Study;


public class Test5 {

    public static void main(String[] args) {
        double random = Math.random()*100;
        System.out.println("随机数为： "+random);
        String str = random+"";                //将random 转化为 String 类型
        int index = str.indexOf(".");         //获取"."的位置

        String str1 = str.substring(0, index+3);

        System.out.println("转换后：" +str1);
    }


}
