public class InterfaceDemo{
    public static void main(String[] args) {
        DemoImpl d = new DemoImpl();
        /* System.out.println(d.NUM);
        System.out.println(DemoImpl.NUM);
        System.out.println(Demo.NUM); */
        Test2 t = new Test2();
        t.show();
    }
}
/* 
    当一个抽象类中的方法都是抽象的时候，这时可以将该抽象类用另一种形式定义和表示，就是接口 Interface
    定义接口使用的关键字不是class，是Interface
    对于接口当中常见的成员：而且这些成员都有固定的修饰符
    1，全局常量：public static final
    2，抽象方法：public abstract
    接口中的成员都是公共的权限
*/
interface Demo{
    public static final int NUM = 10;
    public abstract void show1();
    public abstract void show2();

}

interface A{
    public abstract void show();
}

interface B{
    public abstract int add(int a,int b);
}

class Test implements A,B{
    public void show(){

    }
    public int add(int a,int b){
        return a+b;
    }
}

/* 
    类与类之间是继承关系，类与接口之间是实现关系
    接口不可以实例化
    只能由实现了接口的子类并覆盖了接口中所有的抽象方法后，该子类才可以实例化
    否则这个子类就是一个抽象类
*/


class DemoImpl implements Demo{

    public void show1(){

    }

    public void show2(){

    }
}
/* 
    在Java中不直接支持多继承，因为会出现调用的不确定性
    所以Java将多继承机制进行了改良，在Java中变成了多实现
    一个类可以实现多个接口
    一个类在继承另一个类的同时，还可以实现多个接口
*/
class Q{
    void function(){
        System.out.println("Q...");
    }
}

class Test2 extends Q implements A,B{
    public void show(){
        super.function();
    }

    public int add(int a, int b){
        return a+b;
    }
}

//接口与接口之间是继承关系
interface CC{
    public abstract void show1();
}

interface BB{
    public abstract void show2();
}

interface QQ extends BB,CC{
    public abstract void show3();
}

class HH implements QQ{

    //需要覆盖三个方法
    public void show1(){

    }

    public void show3(){

    }

    public void show2(){

    }
}