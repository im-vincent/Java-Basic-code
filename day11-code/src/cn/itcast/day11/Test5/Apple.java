package cn.itcast.day11.Test5;

public class Apple {

    private int  size;
    private String color;
    private String taste ;



    public void Apple(){

    }

    public Apple(int size, String color , String taste) {
        this.size = size;
        this.color = color;
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                 size + "-" + color  ;
    }
}
