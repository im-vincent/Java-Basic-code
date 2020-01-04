package cn.itcast.day11.Test6;

public class Player {

    FightAble select(String str){
        if("法师".equals(str)){
            return new Fashi();
        }
        else if("战士".equals(str)){
            return new Zhanshi();
        }
        return null;
    }

}
