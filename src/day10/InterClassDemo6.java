package day10;

public class InterClassDemo6{
    public static void main(String[] args) {
        new Outer5().method();
    }
}

class Outer5{

    void method(){
        
        //多态
        Object obj = new Object(){
            public void show(){
                System.out.println("object show");
            }
        };

        //obj.show();//因为匿名内部类这个子类向上转型为了object类型，这样就不能使用子类特有的方法

    }

}