package cn.itcast.day05.demo;

public class Demo04Array {

    public static void main(String[] args) {
        int []arr =new int[]{43,43,23,223,1,212,175,5874231,2,213};
        int [] res=  Method1(arr);
        System.out.println(res[0]);
        System.out.println(res[1]);

    }

    public static int[] Method1(int [] array ){
        int min, max;
        for( min=array[0] , max=array[array.length] ; min < max ; min++, max--){
            int temp;
            if(min>max){
                temp = max;
                max =min;
                min= temp;
            }
            if(min<max){
                temp = max;
                max =min;
                min= temp;
            }
        }
        int []result = {min,max};
        return result;
    }

}
