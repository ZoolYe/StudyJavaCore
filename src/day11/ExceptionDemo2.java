package day11;

public class ExceptionDemo2{
    public static void main(String[] args) {
        int [] arr = new int[3];
        int num =  method(null, -3);
        System.out.println(num);
    }

    public static int method(int []arr, int index){
        
        if(arr == null){
            throw new NullPointerException("请给定一个不为null的数组");
        }
        if(index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("没有这个元素");
        }
        if(index < 0){
            throw new ArrayIndexOutOfBoundsException("数组角标不能为负数");
        }
        if(arr == null){
            throw new NullPointerException("请给定一个不为null的数组");
        }
        return arr[index];
    }

}