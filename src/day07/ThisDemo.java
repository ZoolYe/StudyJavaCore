public class ThisDemo{
    public static void main(String[] args) {
        Persion p1 = new Persion("小强",12);
        Persion p2 = new Persion("旺财",2);
        p1.speak();
        p2.speak();
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
class Persion{

    //姓名
    private String name;

    //年龄
    private int age;

    Persion(String name){
        this.name = name;
    }

    Persion(String name, int age){
        this(name);//必须放在构造函数的第一行
        this.age = age;
    }

    void speak(){
        System.out.println(this.name+"  "+this.age);
    }

}