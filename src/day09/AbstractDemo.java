public class AbstractDemo{
    public static void main(String[] args) {
        
    }
}

/* 
    抽象类：
    抽象：笼统，模糊，看不懂，不具体
    特点：
    1，方法只有声明，没有实现时，该方法就是抽象方法，需要被abstract修饰
        抽象方法必须定义在抽象类中，该类必须被abstract修饰
    2，抽象类不可以被实例化，因为没有 方法体，没意义
    3，抽象类，必须有其子类覆盖了所有的抽象方法后，该子类才可以被实例化
        否则这个子类还是抽象类

    1，抽象类中有构造函数吗？
        有，用于给子类对象进行初始化
    2，抽象类可以不定义抽象方法吗？
        可以，但是很少见
    3，抽象关键字不可以和哪些关键字共存？
        private static final
    4，抽象类和一般类的异同点
        
*/

 abstract class Demo{
    abstract void show();
}