package cn.itcast.day11.demo02;

public class demoHeart {

    public static void main(String[] args) {
        Body body = new Body();              //通过内部类访问
        body.methodBody();
        System.out.println("======");


        Body.Heart heart = new Body().new Heart();  //通过外部类访问
        heart.beat();

    }


}
