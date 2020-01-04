package cn.itcast.day08.Demo05Study;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入源字符串:");
        String srcStr =sc.next();
        System.out.println("请输入要删除的字符串:");
        String delStr = sc.next();
        int count = 0 ;
        count = getCount(srcStr, delStr);
        System.out.println("该字符串中包含" +count+ "个" +delStr);
        String newstr =StrReturn(srcStr , delStr);
        System.out.println("替换后为"  +newstr);

    }

    public static int  getCount(String srcStr , String delStr){
        int index =0 ;
        int count = 0;
        while((index = srcStr.indexOf(delStr,index) )!=-1){
            index ++;
            count++;
        }
        return count;
    }

    public static String StrReturn(String srcStr , String delStr){
        String str = new String();
        str = srcStr.replace(delStr,"");
        return str;
    }
}
