package cn.itcast.day11.Test3;

import java.util.ArrayList;

public class DemoTest {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("A",1);
        User u2 = new User("A",2);
        User u3 = new User("A",3);
        User u4 = new User("A",4);
        User u5 = new User("A",5);
        User u6 = new User("A",6);
        User u7 = new User("A",7);
        User u8 = new User("A",8);
        User u9 = new User("A",9);

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        list.add(u7);
        list.add(u8);
        list.add(u9);
        System.out.println("未分组");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Reception r1 = new Reception();
        Reception r2 = new Reception();
        Reception r3 = new Reception();

        r1.setF(new Filter() {
            @Override
            public void filterUse(User u) {
                if(u.getId() >=1 && u.getId() <5){
                    u.setType("v111");
                }
            }
        });

        r2.setF(new Filter() {
            @Override
            public void filterUse(User u) {
                if(u.getId() >=5 && u.getId()< 8 ){
                    u.setType("v222");
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            r1.reception(user);
            r2.reception(user);
            r3.reception(user);
        }


        System.out.println("以分组");
        for (int i = 0; i <list.size() ; i++) {
            User user  = new User();
            user = list.get(i);
            System.out.println(user +" ");
        }
    }
}
