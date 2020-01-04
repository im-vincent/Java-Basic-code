package cn.itcast.day07.Demo05Study;

import java.util.ArrayList;
import java.util.Random;

public class DemoTest6 {

    public static void main(String[] args) {
        ArrayList<Integer> list  = getScoreList();
        countScore(list);
        ArrayList<Integer> countList = countScore(list);
        printCount(countList);
    }

    public static ArrayList<Integer>  getScoreList( ){
        ArrayList<Integer> list = new ArrayList<>();
        Random r= new Random();
        for (int i = 0; i < 50; i++) {
            int num = r.nextInt(101);
            list.add(num);
        }
        return list;
    }

    public static ArrayList<Integer> countScore(ArrayList<Integer> list){
        ArrayList<Integer> countList =  new ArrayList<>();
        int [] count = new int[4];
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) <= 100 && list.get(i) >= 80 ){
                count[0]++;
            }if(list.get(i) < 80 && list.get(i) >= 60 ){
                count[1]++;
            }if(list.get(i) < 60  && list.get(i) >= 40 ){
                count[2]++;
            }if(list.get(i) < 40  && list.get(i) >= 0 ){
                count[3]++;
            }
        }
        countList.add(count[0]);
        countList.add(count[1]);
        countList.add(count[2]);
        countList.add(count[3]);
        return countList;
    }

    public static void printCount(ArrayList<Integer> countList) {
        int start = 100;
        int end = 80;
        for (int i = 0; i < countList.size(); i++) {
//            Integer integer = countList.get(i);
            System.out.println(start + "\t分 --" + end + " \t分:" + countList.get(i) + "人");
            if (i == 0) {
                start -= 21;
                end -= 20;
            } else if (i == countList.size() - 2) {
                start -= 20;
                end -= 40;
            } else {
                start -= 20;
                end -= 20;

            }
        }
    }
}
