package day05;

import java.util.Arrays;

public class ArrayDemo5{

    public static void main(String[] args) {
        int [] arr = new int []{1,4,67,12,44,10,90,91,10};
        //int key = getIndex(arr, 5);
        //System.out.println(key);
        int index = 0;
        
        //���ֲ��� ���ֲ����и��������Ǿ���Ԫ�ر����������
        //������ڷ��ؾ���ĽǱ�λ�ã���������ڷ��ص��Ǹ����Ĳ�����ټ�һ
        index = Arrays.binarySearch(arr, 2);
        System.out.println(index);
    }

    //���鳣�����ܣ�����
    public static int getIndex(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}