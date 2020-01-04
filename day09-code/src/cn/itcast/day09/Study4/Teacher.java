package cn.itcast.day09.Study4;

public class Teacher extends Person {
    private String course;

    public Teacher() {
    }

    public Teacher(String name , int age ,String course ) {
        super(name, age);
        this.course = course;
    }
    public void teach(){
        System.out.println(super.getName()+ "讲授"+ this.course);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
