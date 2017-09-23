public class ExtendsDemo3{
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        
    }
}

/* 
    成员函数
    当子父类中出现同名成员函数，会运行子类函数
    这种现象，称为覆盖操作，这是函数在子父类中的特性
    函数两个特性：
        1，重载：同一个类中
        2，覆盖：子类中，覆盖也称为重写，复写
*/

class Fu{
    void show(){
        System.out.println("Fu...");
    }
}

class Zi extends Fu{
    void show(){
        System.out.println("Zi...");
    }
}