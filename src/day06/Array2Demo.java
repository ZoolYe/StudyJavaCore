package day06;

public class Array2Demo{

    public static void main(String[] args) {
        /* int [][] arr = new int[3][2];
        System.out.println(arr);//��ӡ���Ƕ�ά������ڴ��ֵַ [[I@15db9742 @�����ʵ������ͣ�@�ұ���ʵ��Ĺ�ϣֵ
        System.out.println(arr[0]);//��ӡ���Ƕ�ά����Ǳ�Ϊ0��һά�����ֵַ
        System.out.println(arr[0][0]);//��ӡ���Ƕ�ά����Ǳ�Ϊ0��һά�ĽǱ�Ϊ0��Ԫ��
        System.out.println(arr.length);//��ӡ��ά����ĳ��ȣ���ʵ����һά����ĸ���
        System.out.println(arr[1].length);//��ӡ��ά�����У��Ǳ�Ϊ1��һά����ĳ���
        
        int[][] arr2 = new int [3][];
        System.out.println(arr2);
        System.out.println(arr2[0]);
        //System.out.println(arr2[0][0]);
        show(); */
        int [][]arr3 = {{1},{1,2,3},{2,2},{90,2,22,1}};
        ayyaysPrint(arr3);
    }


    //��ά���鶨��ĸ�ʽ
    //int [][] arr = new int[3][2];//����һ����ά���飬����������3��һά���飬ÿһ��һά��������2��Ԫ��
    //int [][]arr3 = {{1},{2},{3}};
    public static void show(){
        int [][]arr3 = {{1},{1,2,3},{2,2},{90,2,22,1}};
        System.out.println(arr3.length);
        System.out.println(arr3[2].length);
    }

    public static void ayyaysPrint(int [][]arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int x=0; x<arr[i].length; x++){
                //System.out.println(arr[i][x]);
                sum += arr[i][x];
            }
        }
        System.out.println(sum);
    }

}