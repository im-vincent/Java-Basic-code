package cn.itcast.day08.Demo05Study;

import javax.xml.transform.OutputKeys;
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        boolean b = Ok(str);
        System.out.println(b);
    }
    public static boolean Ok(String str){
        int start = 0;
        int end = str.length()-1;
        while(start< end){
            if(str.charAt(start) != str.charAt(end)){     //返回指定引索的char 值
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
