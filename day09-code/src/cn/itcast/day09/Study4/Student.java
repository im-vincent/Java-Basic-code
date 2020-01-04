package cn.itcast.day09.Study4;

public class Student extends Person {

    private int score;

    public Student() {
    }

    public Student(String name, int age ,int score) {
        super(name, age);
        this.score = score;
    }
    public void study(){
        System.out.println(super.getName()+ "考试分数为:" + this.score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
