package cn.itcast.day09.Study4;

public class Demo {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三" , 20 , "Java");
        teacher.showMsg();
        teacher.teach();
        System.out.println("============");

        Student student = new Student("李四" , 19 ,98);
        student.showMsg();
        student.study();

    }

}
