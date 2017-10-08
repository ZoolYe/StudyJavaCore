package day07;

public class StaticDemo{
    int num = 4;
    public static void main(String[] args) {
        //System.out.println(Persion.country);
        //new Persion().show();
        new StaticDemo().show();
        new Persion().show();
    }

    public void show(){
        System.out.println(num);
    }
}


/* 
    static的特点：
    1，static是一个修饰符，用于修饰成员
    2，static修饰的成员被所有的对象所共享
    3，static优先于对象存在，static成员随着类的加载而加载
    4，static修饰的成员多了一种调用的方式，可以直接被类名所调用  格式:类名.静态成员
    5，static修饰的数据是共享数据，对象中存储的是特有数据

    成员变量和局部变量的区别？
        两种变量的生命周期不同
    1，成员变量随着对象的创建而存在，随着对象的释放而消失
        静态变量随着类的加载而存在，随着类的消失而消失

    2，调用方式不同
        成员变量只能被对象调用
        静态变量可以被对象调用，还可以被类名调用

    3，数据存储位置不同
        成员变量数据存储在堆内存的对象中
        静态变量数据存储在方法区(静态区中)，所以也叫共享数据

    静态使用的注意事项：
    1，静态方法只能访问静态成员。(非静态既可以访问静态，又可以访问非静态)
    2，静态方法中不可以使用this或者spuer关键字
    3，主函数是静态的

*/
class Persion{

    private String name;//成员变量，实例变量
    public static String country = "CN";//静态变量，类变量
    private int age;

    public void show(){
        System.out.println(this.name);
        System.out.println(Persion.country);
    }

}