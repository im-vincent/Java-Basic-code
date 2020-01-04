package cn.itcast.day07.Demo04;

import java.util.ArrayList;

public class Demo06 {

    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();

        list.add("支付宝");
        list.add("微信");
        list.add("平果果");
        list.add("qq");

        System.out.println(list);
        System.out.println("=======");
        Method(list);
    }

    public static void Method(ArrayList<String>  list){

        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i == list.size()-1){
                System.out.println("}");
            }else{
            System.out.print("@");
            }
        }
    }
}
