package cn.itcast.day11.Test2;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> list;

    public Course() {

    }

    public void show(){
        System.out.println("课程名称：" +courseName);
        System.out.println("老师姓名: " +teacher.getName());
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String name = stu.getName();
            if(stu.isCome()){
                System.out.println("上课： " +name );

            }else {
                System.out.println("逛课： " +name );

            }
        }
    }

    public Course(String courseName, ArrayList<Student> list, Teacher teacher) {
        this.courseName = courseName;
        this.list = list;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
