package day11;

public class ExceptionDemo2{
    public static void main(String[] args) {
        int [] arr = new int[3];
        int num =  method(null, -3);
        System.out.println(num);
    }

    public static int method(int []arr, int index){
        
        if(arr == null){
            throw new NullPointerException("�����һ����Ϊnull������");
        }
        if(index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("û�����Ԫ��");
        }
        if(index < 0){
            throw new ArrayIndexOutOfBoundsException("����Ǳ겻��Ϊ����");
        }
        if(arr == null){
            throw new NullPointerException("�����һ����Ϊnull������");
        }
        return arr[index];
    }

}