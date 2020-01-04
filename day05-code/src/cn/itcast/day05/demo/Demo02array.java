package cn.itcast.day05.demo;

public class Demo02array {

    public static void main(String[] args) {
        int [] array ={12,342,3543,3,5,53,234,532,342};
        printArray(array);
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
