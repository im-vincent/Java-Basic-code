package cn.itcast.day06.Demo06;

public class DemoStudent {

    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("============");

        Student stu2  =  new Student( 20 , "xiami");
        System.out.println("name " +  stu2.getName() + " age: "+ stu2.getAge());
        stu2.setName("mmm");
        stu2.setAge(20);
        System.out.println("name " +  stu2.getName() + " age: "+ stu2.getAge());

    }

}
