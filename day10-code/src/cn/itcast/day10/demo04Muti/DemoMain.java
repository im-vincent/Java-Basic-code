package cn.itcast.day10.demo04Muti;

public class DemoMain {

    public static void main(String[] args) {
        Animal animal = new Cat() ;    //把猫向上转型为动物

        animal.eat();                 //向上转型成功 -- 猫吃鱼

//        animal.catchmouse(); // 错误写法，需要向下转型

        //向下转型
        Cat cat =(Cat) animal;
        cat.catchMouse();      //猫捉老鼠


/*       //错误写法， 把猫转型为狗
        Dog dog = (Dog) animal;
        dog.eat();
        dog.dagPaly();*/
    }


}
