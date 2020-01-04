package cn.itcast.day06.Demo03;

public class Person {

    String name;
    private   int age;

    public void setAge(int num) {
        if(num >= 9  && num < 100){
            age = num;
        }
        else{
            System.out.println("非法输入");
        }
    }

    public int getAge() {
        return age;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
    }

}
