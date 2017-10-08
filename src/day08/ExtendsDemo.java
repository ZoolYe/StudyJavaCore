package day08;

public class ExtendsDemo{

    public static void main(String[] args) {

        Student s = new Student();
        s.name = "张删";
        s.age = 15;
        s.study();
    }
    

}

/* 
    继承的好处：
        1，提高了代码的复用性
        2，让类与类之间产生了关系，给第三个特征多态提供了前提
    Java中支持单继承，不直接支持多继承
    单继承：一个子类只能有一个直接父类
    多继承：一个子类可以有多个直接父类(在Java中不允许，但是它改良了)
        不直接支持是因为，会产生调用时的不确定性
        在Java中是通过"多实现"的方式来体现的

    Java中支持多层继承
    c继承b，b继承a
    当要使用一个继承体系时
    1，查看该体系中的顶层类，了解该体系的基本功能
    2，创建该体系中最子类对象，完成功能的使用

    什么时候定义继承？
    当类与类之间存在着所属关系的时候就定义继承，xxx是yyy中的一种，就可以继承
*/

class Persion{
    //姓名
    String name;
    //年龄
    int age;
}

class Worker extends Persion{

    void work(){

    }

}

class Student extends Persion{

    void study(){
        System.out.println(this.name+"    "+this.age);
    }
}