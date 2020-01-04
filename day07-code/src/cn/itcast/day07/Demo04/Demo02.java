package cn.itcast.day07.Demo04;

import java.util.ArrayList;

public class Demo02 {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("迪丽热巴");
        arr.add("古力娜扎");
        arr.add("马儿扎哈");

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i)   );
        }
    }

}
