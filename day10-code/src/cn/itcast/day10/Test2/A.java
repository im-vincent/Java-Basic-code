package cn.itcast.day10.Test2;

public interface A {

    public abstract void showA();

    private void show10(String str){
        for (int i =0; i< 10; i ++){
            System.out.println(str);
        }
    }

    public default void showB10(){
        show10("MAc");
    }
    public default void showC10(){
        show10("小米");
    }

}
