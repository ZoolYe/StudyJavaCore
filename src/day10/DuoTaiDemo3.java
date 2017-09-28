public class DuoTaiDemo3{
    public static void main(String[] args) {
        // Zi z = new Zi();
        // System.out.println(z.num);
        Fu f = new Zi();
        f.function();
    }
}

/* 
    多态时的特点：
    成员的特点：
    1，成员变量：
        编译时：参考引用型变量所属的类中是否有调用的成员变量，没有就会编译失败
        运行时：参考引用型变量所属的类中是否有调用的成员变量，并运行该所属类中的成员变量
        编译和运行都参考左边

    2，成员函数(非静态)：
        编译时：参考引用型变量所属的类中是否有调用的函数，没有就会编译失败
        运行时：参考的是对象所属的类中是否有调用的函数，如果没有就运行父类的函数
        编译看左边，运行看右边

    3，静态函数：
        编译时：参考引用型变量所属的类中是否有调用的静态方法
        运行时：参考引用型变量所属的类中是否有调用的静态方法
        编译和运行都参考左边，其实对于静态方法，是不需要对象的，直接用类名调用即可
*/

class Fu{
    //int num = 3;
    public void show(){
        System.out.println("Fu...");
    }
    public static void function(){
        System.out.println("Fu...function");
    }
}

class Zi extends Fu{
    int num = 4;
    public void show(){
        System.out.println("Zi...");
    }
    public static void function(){
        System.out.println("Zi...function");
    }
}