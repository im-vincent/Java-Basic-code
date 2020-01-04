package cn.itcast.day04.demo01;

public class methodOverLoadSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,10));
        System.out.println(isSame(89L, 54L));
        System.out.println(isSame((short)45, (short)56));
        System.out.println(isSame((byte)90,(byte)90));
    }


    public static boolean isSame(byte a, byte b) {
        System.out.println("byte类型方法重载");
        if(a==b){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(short a, short b) {
        System.out.println("short类型方法重载");
        boolean same;
          same= a==b ? true: false;
          return same;
    }

    public static boolean isSame(int a, int b){
        System.out.println("int类型方法重载");
        return(a==b);
    }

    public static boolean isSame(long a, long b){
        System.out.println("long类型方法重载");
        return(a==b);
    }
}
