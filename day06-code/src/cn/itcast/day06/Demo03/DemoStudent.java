package cn.itcast.day06.Demo03;

public class DemoStudent {

    public static void main(String[] args) {
        Student student = new Student();
        student.name= "张伟";
        student.setNum(124342);
        student.setAge(22);
        student.setMale(true);

            System.out.println("姓名：" + student.name);
            System.out.println("学号:" +student.getNum());
            System.out.println("年龄: " + student.getAge());
            System.out.println("是不是爷们: " + student.isMale());


    }

}
