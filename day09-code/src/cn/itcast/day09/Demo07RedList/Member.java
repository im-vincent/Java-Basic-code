package cn.itcast.day09.Demo07RedList;

import java.util.ArrayList;
import java.util.Random;

public class Member  extends User {

    public Member(){

    }
    public Member(String name , int money){
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //随机获取一个集合中的引索编号
        int index  = new Random().nextInt(list.size());

        //获取已经抢到的红包,并且删除该红包
        int delta =  list.remove(index);
        //获取该成员有多少钱
        int money = super.getMoney();
        //重新设置该用户金额
        super.setMoney(money + delta);
    }
}
