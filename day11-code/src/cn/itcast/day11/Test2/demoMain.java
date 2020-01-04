package cn.itcast.day11.Test2;

import java.util.ArrayList;

public class demoMain {

    public static void main(String[] args) {
        Student stu1 = new Student("小二"  );
        Student stu2 = new Student("张三"  );
        Student stu3 = new Student("李四"  );

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Teacher teacher = new Teacher("张老师");
        Course course = new Course("Java",list,teacher);
        teacher.dianming(list);
        course.show();
    }

}
