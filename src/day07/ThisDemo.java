package day07;

public class ThisDemo{
    public static void main(String[] args) {
        Persion1 p1 = new Persion1("小强",12);
        Persion1 p2 = new Persion1("旺财",12);
        p1.speak();
        p2.speak();
        System.out.println(p1.comparAge(p2));
    }
}

/* 
    当成员变量和局部变量重名，可以用this关键字区分
    this：代表当前对象
    this就是所在函数所属对象的引用
    简单说：哪个对象调用了this所在的函数，this就代表哪个对象

    this也可以用于在构造函数中调用其它构造函数
    注意：只能定义在构造函数的第一行，因为初始化动作要先执行
*/
class Persion1{

    //姓名
    private String name;

    //年龄
    private int age;

    Persion1(){
    }

    Persion1(String name){
        this.name = name;
    }

    Persion1(String name, int age){
        this(name);//必须放在构造函数的第一行
        this.age = age;
    }

    public boolean comparAge(Persion1 persion){
        /* if(this.age==persion.age){
            return true;
        }
        return false; */
        return this.age == persion.age;
    }

    void speak(){
        System.out.println(this.name+"  "+this.age);
    }

}