package cn.itcast.day08.Demo02;

public class Demo01 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        String result = StringReturn(arr);
        System.out.println(result);
    }

    public static String StringReturn(int [] arr){
        String str = "[";
        for(int i = 0; i< arr.length; i++) {
            if (i == arr.length-1) {
                str =str+ "word" + arr[i] + "]";
            } else {
                str =str+ "word" + arr[i] + "#";
            }
        }
        return str;
    }

}
