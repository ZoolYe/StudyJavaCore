package day11;

public class ObjectDemo{
    public static void main(String[] args) {
        Persion p1 = new Persion(20);
        Persion p2 = new Persion(20);

        /* //==比较的是地址值
        System.out.println(p1==p2);
        //object类中的equals比较的也是地址
        System.out.println(p1.equals(p2));

        Demo d = new Demo();
        //p1.equals(d);

        System.out.println(p1);
        System.out.println(Integer.toHexString(p1.hashCode()));

        Class class1 = p1.getClass();
        Class class2 = p2.getClass();
        System.out.println(class1 == class2);
        System.out.println(class1.toString()); */

        Demo5 d = new Demo5();
        System.out.println(d.toString());

        //toString方法的原理
        System.out.println(d.getClass().getName()+"!"+Integer.toHexString(d.hashCode()));
    }
}

/* 
    Object：所有类的根类
    Object是不断抽取而来的，具备着所有对象都具备的共性内容
    常用的共性内容
*/
class Persion extends Object{

    private int age;
    public Persion(int age){
        this.age = age;
    }

/* 
    一般都会覆盖此方法，根据对象的特有内容，建立判断对象是否相同的依据
*/
    public boolean equals(Object obj){

        if(obj instanceof Persion){
            Persion p = (Persion)obj;
            return this.age == p.age;
        }else{
            throw new ClassCastException("类型错误");
        }
    }

    public int hashCode(){
        return this.age;
    }

}

class Demo5{
    public String toString(){
        return "类名："+this.getClass().getName()+" 内存地址："+Integer.toHexString(hashCode());
    }
}