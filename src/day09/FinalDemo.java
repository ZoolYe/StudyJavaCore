public class FinalDemo{
    public static void main(String[] args) {
        
    }
}

/* 
    final关键字：
    1，final是一个修饰符，可以修饰类，方法，变量
    2，fianl修饰的类不可以被继承
    3，final修饰的方法不可以被覆盖
    4，fianl修饰的变量是一个常量，只能赋值一次
*/

class  Fu{

    void show(){

    }

}

class Zi extends Fu{
    final int sum = 10;
    final int x;
    void show(){
        
    }
    void setSum(int sum){
        //this.sum = sum;
    }
}