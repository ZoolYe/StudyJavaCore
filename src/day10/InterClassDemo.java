public class InterClassDemo{
    public static void main(String[] args) {
        
        //直接访问外部类中的内部类中的成员
        /* Outer o = new Outer();
        Outer.Inter i = o.new Inter();
        i.show();

        Outer.Inter oi = new Outer().new Inter();
        oi.show(); */
        
        //如果内部类是静态的
        Outer.Inter oi = new Outer.Inter();
        oi.show();

        //如果内部类是静态的，内部类成员也是静态的
        Outer.Inter.show();
    }
}

/* 
    内部类的访问特点：
        1，内部类可以直接访问外部类中的成员
        2，外部类要访问内部类，必须要建立内部类的对象
    用途：一般用于类的设计，分析事物时，发现该事物描述中还有事物，而且这个事物还在访问被描述事物的内容
        这时就把还有的事物定义成内部类来描述

     如果内部类是静态的，就相当于是一个外部类，因为外部类加载之前内部类就已经存在了
     如果内部类中定义了静态成员，该内部类也必须是静态的
*/
class Outer{
    private static int num = 10;
    //内部类
    static class Inter{
        static void show(){
            System.out.println("show run  "+num);
        }
    }

    public void metion(){
        Inter i = new Inter();
        i.show();
    }

}