package day05;

public class ArrayTest2{

    public static void main(String[] args) {
        //toHex(12);
        getWeerk(8);
    }


    //��ȡһ��������16���Ʊ�����ʽ
    public static void toHex(int num){
        System.out.println(Integer.toHexString(num));
    }


    public static void getWeerk(int wee){

        String []arr = {"����һ","���ڶ�","������","������","������","������","������"};

        if(wee>=1 && wee<=7){
            System.out.println(arr[wee-1]);
        }else{
            System.out.println("û�ж�Ӧ������");
        }

    }
}