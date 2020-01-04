package cn.itcast.day10.demo04Muti;

public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal animal = new Dog();

        if(animal instanceof  Cat){
            animal.eat();
            ((Cat) animal).catchMouse();
        }
        if (animal instanceof  Dog){
            Dog dog = (Dog) animal;
            dog.eat();
            dog.dagPaly();                //或者下面方式
//            ((Dog) animal).dagPaly();
//            animal.eat();
        }
        System.out.println("======");
        giveAPet(animal);
    }

    public static  void giveAPet(Animal animal){
        if(animal instanceof  Cat){
            animal.eat();
            ((Cat) animal).catchMouse();
        }
        if (animal instanceof  Dog){
            ((Dog) animal).dagPaly();
            animal.eat();
        }
    }

}
