package cn.itcast.day09.Demo07RedList;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User {

    public Manager() {

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> RedList = new ArrayList<Integer>();

        if (totalMoney > super.getMoney()) {                //判断群主得钱 与发送的钱
            System.out.println("余额不足，发送失败！！！");
            return RedList;
        }

        super.setMoney(super.getMoney() - totalMoney);    //扣钱， 扣发送者得钱

        //平分钱
        int avg = totalMoney / count;
        int mad = totalMoney % count;     //除不尽得钱

        //塞钱
        for (int i = 0; i < count-1; i++) {
            RedList.add(avg);
        }
        RedList.add(mad + avg);                //除不尽得钱放到最后一个包

        return RedList;
    }
}



