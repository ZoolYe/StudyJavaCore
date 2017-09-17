/* 
描述小汽车
分析：
1，属性
    轮胎数
    颜色

2，行为
    运行

定义类其实就是在定义类中的成员
成员：成员变量(属性)，成员函数(行为)

成员变量和局部变量的区别：
1，成员变量定义在类中，整个类中都可以访问
    局部变量定义在函数，语句，局部代码块中，只在所属的作用范围有效
2，成员变量存在于堆内存的对象中
    局部变量存在于栈内存的方法中
3，成员变量随着对象的创建而出现，随着对象的消失而消失
    局部变量随着所属区域的执行而存在，随着所属区域的结束而释放
4，成员变量都有默认初始化值
    局部变量没有默认初始化值
*/
public class CarDemo{
    
    public static void main(String[] args) {
        //创建一个car实例，通过new关键字
       /*  Car c1 = new Car();//c1就是一个类类型的引用变量，指向了该类的对象
        c1.sum = 4;
        c1.color ="红色";
        c1.run();//要使用对象中的内容可以通过，对象.成员的形式来完成调用
 */
        Car c2 = new Car();
        Car c3 = new Car();
        c2.color = "red";
        /* c2.sum = 4;
        c3.color = "red";
        c3.sum = 4; */
        setCar(c2);
        setCar(c3);
        c2.run();
        c3.run();

        /* 匿名对象
            匿名对象其实就是定义对象的简写格式
        1，当对象对方法仅进行一次调用的时候，就可以简化成匿名对象
        2，匿名对象可以作为实际参数进行传递
        */
        new Car().color = "haha";
        new Car().sum = 12;
        new Car().run();
        setCar(new Car());

    }

    //汽车改装厂
    public static void setCar(Car c){//类类型的变量一定指向对象，要不就是null
        c.color = "red";
        c.sum = 4;
    }

}

class Car{

    int sum;
    String color;

    void run(){
        //sum =10;
        System.out.println(sum+color+"...");
    }

}