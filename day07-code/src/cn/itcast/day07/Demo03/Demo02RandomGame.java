package cn.itcast.day07.Demo03;

/*
模拟猜数小游戏
 */

import java.util.Random;
import java.util.Scanner;

public class Demo02RandomGame {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;//  1-100
        int count = 0 ;
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            count++;
            int res = sc.nextInt();
            if (res == num) {
                System.out.println("恭喜你猜中了！！！");
                break;
            } else if (res > num) {
                System.out.println("猜大了，请重新输入！！ ");
                continue;
            } else {
                System.out.println("猜小了，请重新输入！！ ");
                continue;
            }
        }
        System.out.println("游戏结束了！！！" );
        System.out.println("总共猜了：" + count + "次");

    }
}
