package cn.itcast.day11.demo07;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list  = new ArrayList<>();
        //随机发红包， 最少1 最大不超过平均数的2倍

        int leftMoney = totalMoney;
        int leftCount = totalCount;
        Random r = new Random();
        for(int i = 0;  i< totalCount -1;  i++){
            int money = r.nextInt(leftMoney / leftCount *2 )+1;
            list.add(money);
            leftCount -= money;
            leftCount--;
        }
        list.add(leftMoney);
        return list;
    }
}
