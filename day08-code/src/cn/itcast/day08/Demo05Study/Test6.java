package cn.itcast.day08.Demo05Study;

import java.util.ArrayList;

public class Test6 {

    public static void main(String[] args) {
         ArrayList<String > list = new ArrayList<>();
         list = Method1();
        System.out.println("输入有：" + list);
         Method2(list);
        System.out.println("删除后为 ： " + list);

    }
    public static ArrayList<String> Method1(){
        ArrayList<String> list  = new ArrayList<>();
        list.add("你好");
        list.add("bca");
        list.add("dadfa");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦,你干嘛呢");
        list.add("别跑啊");
        return list;
    }
    public static void Method2(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if(str.length() >5){
                newList.add(str);    //将要删去 的元素放入新list中
            }
        }
        for(Object str: newList){
            list.remove(str);        //删除之前放入新list中的元素
        }
    }

}
