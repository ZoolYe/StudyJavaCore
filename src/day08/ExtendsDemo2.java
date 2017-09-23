public class ExtendsDemo2{

    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}
/* 
    在子父类中，成员的特点体现
    1，成员变量
    2，成员函数
    3，构造函数

    _________________________________________

    1，成员变量
    当本类的成员和局部变量同名用this区分
    当子父类中的成员变量同名用super区分父类
    this和super的用法很相像
    this：代表一个本类对象的引用
    super：代表一个父类的空间
*/

class Fu{
    //父类成员变量私有以后，子类是不能直接访问的
    private int num = 12;
}

class Zi extends Fu{
    int num = 13;
    void show(){
        System.out.println(num+"   "+super.num);
    }
}