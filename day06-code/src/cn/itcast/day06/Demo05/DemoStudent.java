package cn.itcast.day06.Demo05;

public class DemoStudent {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("张力尹", 29);
        System.out.println("name: "+ stu2.getName() +" age： "+ stu2.getAge());
        System.out.println("========");

        stu2.setName("张三");
        stu2.setAge(30);
        System.out.println("name: "+ stu2.getName() +" age： "+ stu2.getAge());
    }

}
