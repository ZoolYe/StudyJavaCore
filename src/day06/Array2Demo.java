package day06;

public class Array2Demo{

    public static void main(String[] args) {
        /* int [][] arr = new int[3][2];
        System.out.println(arr);//打印的是二维数组的内存地址值 [[I@15db9742 @左边是实体的类型，@右边是实体的哈希值
        System.out.println(arr[0]);//打印的是二维数组角标为0的一维数组地址值
        System.out.println(arr[0][0]);//打印的是二维数组角标为0的一维的角标为0的元素
        System.out.println(arr.length);//打印二维数组的长度，其实就是一维数组的个数
        System.out.println(arr[1].length);//打印二维数字中，角标为1的一维数组的长度
        
        int[][] arr2 = new int [3][];
        System.out.println(arr2);
        System.out.println(arr2[0]);
        //System.out.println(arr2[0][0]);
        show(); */
        int [][]arr3 = {{1},{1,2,3},{2,2},{90,2,22,1}};
        ayyaysPrint(arr3);
    }


    //二维数组定义的格式
    //int [][] arr = new int[3][2];//创建一个二维数组，该数组中有3个一维数组，每一个一维数组中有2个元素
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