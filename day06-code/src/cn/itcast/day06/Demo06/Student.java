package cn.itcast.day06.Demo06;

public class Student {

    private int age;
    private String name;

    public Student() {
        System.out.println("无参构造方法开始");
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
