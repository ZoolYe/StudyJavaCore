package day08;

public class ArrayTool{

    /**
     * ����һ�����ڲ�������Ĺ����࣬���а����ų����Ķ���������ĺ��� �磺��ֵ�����򣬴�ӡ�ȡ�
     * @author ZOOL
     * @version v0.1
     */

    /* �����еĶ����Ǿ�̬�ģ����Ը��಻��Ҫ��������Ϊ�˱�֤�����䴴���������Խ�����Ĺ��캯��˽�л� */
    private ArrayTool(){} 

    /**
     * ��ȡ������������ֵ
     * @param arr ����һ��int���͵�����
     * @return ���ظ�����������Ԫ��ֵ
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
     * ��ȡ��������Ԫ�صĽǱ꣬��Ԫ�ز�����ʱ����-1
     * @param arr ����һ��int���͵�����
     * @param key ����һ��int���͵���ֵ
     * @return ����һ��int���͵���ֵ����Ӧ��ֵ��Ԫ�ؽǱ�
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
     * ����Ԫ�����򣬴�С����ѡ���������ܵ���
     * @param arr ����һ��int���͵�����
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
     * ��������λ���û�
     * @param arr ����һ��int���͵�����
     * @param a Ҫ�û���Ԫ��a��int����
     * @param b Ҫ�û���Ԫ��b��int����
     */
    private static void sawp(int []arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * ���������ӡ����ӡ��ʽ���£�[1,2,3]
     * @param arr ����һ��int���͵�����
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

