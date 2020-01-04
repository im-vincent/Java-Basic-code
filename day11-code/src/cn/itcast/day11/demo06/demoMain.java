package cn.itcast.day11.demo06;


public class demoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("飞虎队");
        hero.setSkill(new SkillInterfaceImpl());
        hero.attack();
        System.out.println("=======");

        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("怼怼怼");
            }
        });
        hero.attack();


    }

}
