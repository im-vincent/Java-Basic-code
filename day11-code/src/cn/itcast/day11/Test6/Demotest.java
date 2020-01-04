package cn.itcast.day11.Test6;

public class Demotest {

    public static void main(String[] args) {
        String str1 = "法师";
        String str2 = "战士";

        Player p = new Player();
        FightAble s1 = p.select(str1);
        System.out.println("选择" + str1 + "角色");
        s1.commonFight();
        s1.specialFight();

        System.out.println("==================");
        FightAble s2 = p.select(str2);
        System.out.println("选择" + str2+ "角色");
        s2.commonFight();
        s2.specialFight();
    }

}
