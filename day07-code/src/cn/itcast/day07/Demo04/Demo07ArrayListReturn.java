package cn.itcast.day07.Demo04;

import java.util.ArrayList;
import java.util.Random;

public class Demo07ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Method(list);
    }

    public static void Method(ArrayList<Integer> list  ){
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(300)+1;
            list.add(num);
        }

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list1.add(list.get(i));
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

}
