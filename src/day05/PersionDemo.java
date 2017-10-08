package day05;

class Persion{

/* 
    人的属性：
    年龄

    人的行为：
    说话

    private：私有，是一个权限修饰符，用于修饰成员，私有的内容只在本类中有效
    注意：私有仅仅是封装的一种体现而已

    构造函数：构建创造对象时调用的函数。作用：可以给对象进行初始化。
    创建对象都必须要通过构造函数初始化
    一个类中如果没有定义过构造函数，那么该类中会有一个默认的空参数的构造函数
    如果在类中定义了制定的构造函数，那么类中的默认构造函数就没有了

    一般函数和构造函数的区别
    构造函数：对象创建时就会调用与之对应的构造函数，对对象进行初始化
    一般函数：对象创建后需要该函数功能时才调用

    构造函数：对象创建时，只调用一次
    一般函数：对象创建后，可以被调用多次

    什么时候定义构造函数？
    在描述事物时，该事物一存在就具备一些内容，这些内容都定义在构造函数中

*/
    private int age;//私有变量年龄

    private String name;

    //构造函数
    Persion(){
        age = 1;
        name = "baby";
        //System.out.println("构造函数");
    }

    Persion(String name){
        this.name = name;
    }

    Persion(String name, int age){
        this.name = name;
        this.age = age;
    }

    Persion(int age, String name){
        this.age = age;
        this.name = name;
    } 

    //设置年龄
    public void setAge(int age){
        if(age>0 && age<=130){
            this.age = age;
        }else{
            this.age = -1;
        }
    }

    //获取年龄
    public int getAge(){
        return this.age;
    }

    //说话方法
    void speak(){
        System.out.println(name+age);
    }

}

public class PersionDemo{
    public static void main(String[] args) {
        Persion p = new Persion();//构造函数：构建创造对象时调用的函数。作用：可以给对象进行初始化。
        //p.setAge(-2);
        Persion p1 = new Persion("张三");
        p1.speak();
        p.speak();

        Persion p2 = new Persion("李四",12);
        p2.speak();

        Persion p3 = new Persion(20,"sili");
        p3.speak();
    }
}