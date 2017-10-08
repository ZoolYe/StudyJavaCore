package day10;

public class InterClassDemo2{
    public static void main(String[] args) {
        Outer1.Inter oi = new Outer1().new Inter();
        oi.show();
    }
}
/* 
    为什么内部类能直接访问外部类中的成员呢？
    因为内部类持有了外部类的引用 外部类名.this
*/
class Outer1{
    int num = 5;

    class Inter{
        int num = 4;
        void show(){
            int num = 3;
            System.out.println(Outer1.this.num);
        }
    }
}