public class ArrayDemo4{

    public static void main(String[] args) {
        int [] arr = new int []{1,4,67,12,44,10,90,91,10};
        int max = getMax(arr);
        System.out.println(max);

    }


    /* ��ȡ����������ֵ
     * ˼·��
     *  1����Ҫ���бȽϣ�������һ��������¼סÿ�αȽϺ�����ֵ
     *  2���������е�Ԫ�ؽ��б���ȡ�����ͱ����м�¼��Ԫ�ؽ��бȽ�
     *      �����������Ԫ�ش��ڱ����е�Ԫ�أ����ñ�����¼ס���Ԫ��
     */

    public static int getMax(int []arr){

        //����һ��������¼����ֵ
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMax_2(int []arr){
        
                //����һ��������¼����ֵ
                int max = 0;
                for(int i=1; i<arr.length; i++){
                    if(arr[i]>arr[max]){
                        arr[max] = arr[i];
                    }
                }
                return max;
            }


}