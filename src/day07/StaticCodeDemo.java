package day07;

/* 
    静态代码块
    随着类的加载而执行，只执行一次
    作用：
    用于给类进行初始化
*/
public class StaticCodeDemo{

    static{
        System.out.println("man static code");
    }

    public static void main(String[] args) {
        new StaticCdoe().show();
        new StaticCdoe().show();
        StaticCdoe.show();
    }
}

class StaticCdoe{

    static{
        System.out.println("静态代码块");
    }

    //构造代码块，可以给所有对象进行初始化
    {
        System.out.println("构造代码块");
    }

    static void show(){
        
        System.out.println("show...");
    }

}