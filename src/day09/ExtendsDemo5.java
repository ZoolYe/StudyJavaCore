package day09;

public class ExtendsDemo5{
    public static void main(String[] args) {
        Zi2 z = new Zi2();
        z.show();
    }
}

/* 
    一个对象实例化过程
    Persion p = new Persion();
    1，jvm读取指定路径下的xxx.class文件，并加载进内存,并会先加载Persion的父类(如果有直接父类)
    2，在堆内存中开辟空间，分配内存地址
    3，并在对象空间中，对对象中的属性进行默认初始化
    4，调用对应的构造函数进行初始化
    5，在构造函数中，第一行会先调用父类中构造函数进行初始化
    6，父类初始化完毕后，再对子类的属性进行显示初始化
    7，再进行子类构造函数的特定初始化
    8，初始化完毕后，将地址值赋值给引用变量
*/

class Fu2{
    
    Fu2(){
        super();
        show();//子类有show方法时执行子类show方法
        return;
    }
    void show(){
        System.out.println("fu show");
    }
}

class Zi2 extends Fu2{
    
    int num = 8;

    Zi2(){
        super();
        /* >>通过super初始化父类内容时，子类的成员变量并未显示初始化，等super()父类初始化完毕后，
            才进行子类的成员变量显示初始化 */
        System.out.println("zi cons run "+num);
        return;
    }
    void show(){
        System.out.println("zi show"+num);
    }
}