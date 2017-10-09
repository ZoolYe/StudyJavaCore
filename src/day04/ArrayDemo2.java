package day04;

public class ArrayDemo2{
    
    public static void main(String[] args) {
        
        int [] arr = new int[3];
        //System.out.println(arr[34]);//java.lang.ArrayIndexOutOfBoundsException 数组角标越界异常
        //当访问到数组中不存在的角标时，就会触发该异常
        //arr = null;
        //System.out.println(arr[0]);//java.lang.NullPointerException 空指针异常
        //当引用型变量没有任何实体指向时，还在对其操作，就会触发该异常
        System.out.println(arr);
    }

}