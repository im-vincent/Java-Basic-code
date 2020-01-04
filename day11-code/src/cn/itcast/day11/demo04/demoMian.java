package cn.itcast.day11.demo04;

public class demoMian {


    public static void main(String[] args) {
        MyInterface obj1 = new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("使用匿名对象AA-1");
            }

            @Override
            public void methodB() {
                System.out.println("使用匿名对象BB-2");
            }
        };
        obj1.methodA();
        obj1.methodB();
        System.out.println("================");

        new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("使用匿名对象AA-2");
            }

            @Override
            public void methodB() {
                System.out.println("使用匿名对象BB-2");
            }
        }.methodA();

        new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("使用匿名对象AA-2");
            }

            @Override
            public void methodB() {
                System.out.println("使用匿名对象BB-2");
            }
        }.methodB();

    }
}
