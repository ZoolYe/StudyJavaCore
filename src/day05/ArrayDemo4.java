public class ArrayDemo4{

    public static void main(String[] args) {
        int [] arr = new int []{1,4,67,12,44,10,90,91,10};
        //int max = getMax(arr);
        //System.out.println(max);
        sort(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        printArray(arr);
    }

    //打印数组
    public static void printArray(int arr[]){

        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){

            if(i==arr.length){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }
        }

    }

    //排序数组，按从小到大的顺序排列
    public static void sort(int []arr){

        for(int i=0; i<arr.length-1; i++){
            
            for(int x=i+1; x<arr.length; x++){

                if(arr[i]>arr[x]){
                    int temp=arr[x];
                    arr[x]=arr[i];
                    arr[i]=temp;
                }

            }

        }

    }


    /* 获取数组中最大的值
     * 思路：
     *  1，需要进行比较，并定义一个变量记录住每次比较后最大的值
     *  2，对数组中的元素进行遍历取出，和变量中记录的元素进行比较
     *      如果遍历到的元素大于变量中的元素，就用变量记录住这个元素
     */

    public static int getMax(int []arr){

        //定义一个变量记录最大的值
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMax_2(int []arr){
        
                //定义一个变量记录最大的值
                int max = 0;
                for(int i=1; i<arr.length; i++){
                    if(arr[i]>arr[max]){
                        arr[max] = arr[i];
                    }
                }
                return max;
            }


}