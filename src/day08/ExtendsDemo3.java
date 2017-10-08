package day08;

public class ExtendsDemo3{
    public static void main(String[] args) {
        Zi1 z = new Zi1();
        z.show();
        
    }
}

/* 
    成员函数
    当子父类中出现同名成员函数，会运行子类函数
    这种现象，称为覆盖操作，这是函数在子父类中的特性
    函数两个特性：
        1，重载：同一个类中 overload
        2，覆盖：子类中，覆盖也称为重写，复写 override
    覆盖注意事项：
    1，子类方法覆盖父类方法时，子类权限必须要大于等于父类的权限
    2,静态只能覆盖静态，或被静态覆盖

    什么时候使用覆盖操作：
    当一个类进行子类的扩展时，子类需要保留父类的功能声明，但是
    要定义子类中该功能的特有内容时，就使用覆盖操作完成
*/

class Fu1{
     void show(){
        System.out.println("number...");
    }
}

class Zi1 extends Fu1{
   public void show(){
       super.show();
       System.out.println("pic...");
       System.out.println("name...");
    }
}