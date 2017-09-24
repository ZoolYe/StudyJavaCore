public class InterfaceDemo{
    public static void main(String[] args) {
    
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