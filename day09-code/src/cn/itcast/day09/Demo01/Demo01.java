package cn.itcast.day09.Demo01;

public class Demo01 {

    public static void main(String[] args) {
        YuanGong yu  = new YuanGong();
        yu.yuangong();
        System.out.println(yu.numYu);
        System.out.println("==========");

        Teacher teacher = new Teacher();
        teacher.teacher();
        System.out.println(teacher.numT);
    }

}
