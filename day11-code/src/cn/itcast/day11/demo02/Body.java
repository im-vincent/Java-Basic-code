package cn.itcast.day11.demo02;

public class Body {

    int  num = 10;

    public class Heart{
        int num = 20;
        public void beat(){
            int num = 30;
            System.out.println("我叫:" + name);
            System.out.println("心脏跳动");
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);
        }
    }

    private String name;

    public void methodBody(){
        System.out.println("外部类方法");
        new Heart().beat();
    }

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
