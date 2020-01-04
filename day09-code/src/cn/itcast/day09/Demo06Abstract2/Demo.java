package cn.itcast.day09.Demo06Abstract2;

public class Demo {

    public static void main(String[] args) {
        Dog2ha ha = new Dog2ha();
        ha.eat();
        ha.sleep();
        System.out.println("==========");

        DogGolden golden =new DogGolden();
        golden.eat();
        golden.sleep();


    }

}
