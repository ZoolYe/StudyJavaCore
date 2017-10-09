package day05;

public class ArrayDemo3{

    public static void main(String[] args) {
        /* 格式1 
         * 什么时候定义：需要一个容器，但不明确具体的数据
         */
        int [] arr = new int [3];

        /* 元素类型[] 数组名 = new 元素类型 []{元素,元素,...};
         * 什么时候定义，需要一个容器，存储已知的数据
         */
        int [] arr2 = new int []{5,6,7,8,9,0};
        int [] arr3 = {1,2,3,4,5,6,7,8,9,10};

        /* 对数组操作最基本的动作就是存和取
         * 核心思想：就是对角标进行操作
         */

        for(int i=0; i<arr3.length; i++){

            //System.out.println("arr["+i+"]"+"="+arr3[i]);
        }

        for(int x=arr3.length-1; x>=0; x--){
            
           System.out.println("arr["+x+"]"+"="+arr3[x]);
        }

    }
}