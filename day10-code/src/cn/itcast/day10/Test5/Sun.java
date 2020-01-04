package cn.itcast.day10.Test5;

public class Sun extends Star implements Universe {


    @Override
    public void doanything() {
        System.out.println("sun: 太阳吸引九大行星转");
    }
    public void shine(){
        System.out.println(" sun:光照八分钟，到达地球");
    }
}
