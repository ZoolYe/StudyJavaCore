package day05;

public class ArrayDemo3{

    public static void main(String[] args) {
        /* ��ʽ1 
         * ʲôʱ���壺��Ҫһ��������������ȷ���������
         */
        int [] arr = new int [3];

        /* Ԫ������[] ������ = new Ԫ������ []{Ԫ��,Ԫ��,...};
         * ʲôʱ���壬��Ҫһ���������洢��֪������
         */
        int [] arr2 = new int []{5,6,7,8,9,0};
        int [] arr3 = {1,2,3,4,5,6,7,8,9,10};

        /* ���������������Ķ������Ǵ��ȡ
         * ����˼�룺���ǶԽǱ���в���
         */

        for(int i=0; i<arr3.length; i++){

            //System.out.println("arr["+i+"]"+"="+arr3[i]);
        }

        for(int x=arr3.length-1; x>=0; x--){
            
           System.out.println("arr["+x+"]"+"="+arr3[x]);
        }

    }
}