package cn.itcast.day07.Demo05Study;

import java.util.ArrayList;

public class MyList {
    private ArrayList<Integer> list = new ArrayList<>();

    public void add(Integer i){
        list.add(i);
    }

    public Integer remove(){
        Integer remove = list.remove(list.size()-1);
        return remove;
    }

    public void show(){
        System.out.println(list);
    }
}
