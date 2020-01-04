package cn.itcast.day07.Demo05Study;

public class DemoTest5 {

    public static void main(String[] args) {
        MyList m1 = new MyList();
        for (int i = 10; i < 14; i++){
            m1.add(i);
        }
        System.out.println("添加元素后：");
        m1.show();

        Integer remove = m1.remove();
        System.out.println("获取元素:");
        System.out.println(remove);
        System.out.println("获取元素后:");
        m1.show();
    }
}
