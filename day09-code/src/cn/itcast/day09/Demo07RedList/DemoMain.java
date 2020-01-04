package cn.itcast.day09.Demo07RedList;

import java.util.ArrayList;

public class DemoMain {

    public static void main(String[] args) {
        Manager manager = new Manager("马云" ,100);
        Member one = new Member("成员A" , 0);
        Member two = new Member("成员B" ,0);
        Member three = new Member("成员C" ,0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("========");

        ArrayList<Integer> RedList = manager.send(100,3);
        one.receive(RedList);
        two.receive(RedList);
        three.receive(RedList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }

}
