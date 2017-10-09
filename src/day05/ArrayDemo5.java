package day05;

import java.util.Arrays;

public class ArrayDemo5{

    public static void main(String[] args) {
        int [] arr = new int []{1,4,67,12,44,10,90,91,10};
        //int key = getIndex(arr, 5);
        //System.out.println(key);
        int index = 0;
        
        //二分查找 二分查找有个条件，那就是元素必须是有序的
        //如果存在返回具体的角标位置，如果不存在返回的是负数的插入点再减一
        index = Arrays.binarySearch(arr, 2);
        System.out.println(index);
    }

    //数组常见功能：查找
    public static int getIndex(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}