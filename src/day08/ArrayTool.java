package day08;

public class ArrayTool{

    /**
     * 建立一个用于操作数组的工具类，其中包含着常见的对数组操作的函数 如：最值，排序，打印等。
     * @author ZOOL
     * @version v0.1
     */

    /* 该类中的对象都是静态的，所以该类不需要创建对象，为了保证不让其创建对象，所以将该类的构造函数私有化 */
    private ArrayTool(){} 

    /**
     * 获取整型数组的最大值
     * @param arr 接收一个int类型的数组
     * @return 返回该数组中最大的元素值
     */
    public static int getArrayMax(int []arr){
        int item = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>item){
                item = arr[i];
            }
        }
        return item;
    }

    /**
     * 获取整型数组元素的角标，当元素不存在时返回-1
     * @param arr 接收一个int类型的数组
     * @param key 接收一个int类型的数值
     * @return 返回一个int类型的数值，对应数值的元素角标
     */
    public static int getIndex(int []arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    /**
     * 数组元素排序，从小到大，选择排序，性能底下
     * @param arr 接收一个int类型的数组
     */
    public static void selectSort(int []arr){
        for(int i=0; i<arr.length-1; i++){
            for(int x=i; x<arr.length; x++){
                if(arr[i]>arr[x]){
                    sawp(arr, i, x);
                }
            }
        }
    }

    /**
     * 整型数组位置置换
     * @param arr 接收一个int类型的数组
     * @param a 要置换的元素a，int类型
     * @param b 要置换的元素b，int类型
     */
    private static void sawp(int []arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * 整型数组打印，打印格式如下：[1,2,3]
     * @param arr 接收一个int类型的数组
     */
    public static void arrayPrint(int []arr){
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+", ");
            }else{
                System.out.print(arr[i]+" ]\n");
            }
        }
    }

}

