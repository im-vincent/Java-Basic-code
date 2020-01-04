package cn.itcast.day11.demo07;

import cn.itcast.day11.red.OpenMode;

public class Bootstrap {
    public static void main(String[] args) {

        MyRed red = new MyRed("七七八爱");

        red.setOwnerName("王思聪");


        //下面两种方式分别为 normol 与random方式
//        OpenMode normol = new NormolMode();
//        red.setOpenWay(normol);

        OpenMode random = new RandomMode();
        red.setOpenWay(random);

    }
}
