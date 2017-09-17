class Persion{

/* 
    人的属性：
    年龄

    人的行为：
    说话

    private：私有，是一个权限修饰符，用于修饰成员，私有的内容只在本类中有效
    注意：私有仅仅是封装的一种体现而已

    构造函数：构建创造对象时调用的函数。作用：可以给对象进行初始化。
    创建对象都必须要通过构造函数初始化
    一个类中如果没有定义过构造函数，那么该类中会有一个默认的空参数的构造函数
    如果在类中定义了制定的构造函数，那么类中的默认构造函数就没有了

*/
    private int age;//私有变量年龄

    private String name;

    //构造函数
    Persion(){
        System.out.println("构造函数");
    }

    //设置年龄
    public void setAge(int age){
        if(age>0 && age<=130){
            this.age = age;
        }else{
            this.age = -1;
        }
    }

    //获取年龄
    public int getAge(){
        return this.age;
    }

    //说话方法
    void speak(){
        System.out.println(name+age);
    }

}

public class PersionDemo{
    public static void main(String[] args) {
        Persion p = new Persion();//构造函数：构建创造对象时调用的函数。作用：可以给对象进行初始化。
        p.setAge(-2);
        p.speak();
    }
}