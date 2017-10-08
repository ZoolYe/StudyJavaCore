package day05;

public class ArrayTest2{

    public static void main(String[] args) {
        //toHex(12);
        getWeerk(8);
    }


    //获取一个整数的16进制表现形式
    public static void toHex(int num){
        System.out.println(Integer.toHexString(num));
    }


    public static void getWeerk(int wee){

        String []arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};

        if(wee>=1 && wee<=7){
            System.out.println(arr[wee-1]);
        }else{
            System.out.println("没有对应的星期");
        }

    }
}