/* 
    静态代码块
    随着类的加载而执行，只执行一次

    作用：
    用于给类进行初始化
*/
public class StaticCodeDemo{
    public static void main(String[] args) {
        // new StaticCdoe().show();
        // new StaticCdoe().show();
        StaticCdoe sc = new StaticCdoe();
        sc.show();

        StaticCdoe sc2 = new StaticCdoe();
        sc2.show();
    }
}

class StaticCdoe{

    static{
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    void show(){
        System.out.println("show...");
    }

}