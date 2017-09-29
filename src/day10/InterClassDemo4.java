public class InterClassDemo4{
    public static void main(String[] args) {
        new Outer().show();
    }
}

/* 
    匿名内部类，就是内部类的简写格式
    必须有前提：内部类必须继承或者实现一个外部类或者接口
    匿名内部类：其实就是一个匿名子类对象
*/
class Outer{

    int num = 10;

    public void show(){

        new Demo(){
            void show(){
                System.out.println("匿名内部类");
            }
        }.show();

    }

}

abstract class Demo{
    abstract void show();
}