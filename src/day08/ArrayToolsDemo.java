
public class ArrayToolsDemo{
    public static void main(String[] args) {
        
        int [] arr = new int[]{21,22,1,40,20,80,0,3,15,90};
        ArrayTool.selectSort(arr);
        ArrayTool.arrayPrint(arr);
        System.out.println(ArrayTool.getIndex(arr, 0));
    }
}