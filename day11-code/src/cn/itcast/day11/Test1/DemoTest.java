package cn.itcast.day11.Test1;

public class DemoTest {

    public static void main(String[] args) {
        String str = "25.2233423545";
        System.out.println("原数字为" + str);

        HandleAble hand1 = new HandleAble() {
            @Override
            public String HandleString(String num) {

               return  num.substring(0,num.indexOf("."));
            }
        };
        String res = hand1.HandleString(str);
        System.out.println("取整后为:" + res);


        int count = 4;
        HandleAble hand2 = new HandleAble() {
            @Override
            public String HandleString(String num) {
                int index = num.indexOf(".")+ count +1;
                char  ch = num.charAt(index);

                if('4' > ch){
                    return num.substring(0,index).toString();
                }else{
                    char c1 = (char) (str.charAt(str.indexOf(".") + count) + 1);

                    return num.substring(0, index -1 )+c1;
                }
            }
        };

        String res2 = hand2.HandleString(str);
        System.out.println("保留"+count+"位小数后： " +res2);
    }

}
