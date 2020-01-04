package cn.itcast.day11.demo05;

public class demoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAge(20);
        hero.setName("盖伦");

        Weapon weapon = new Weapon("AK-47");
        hero.setWeapon(weapon);                    //把它当普通类传参使用
        hero.show();
    }


}
