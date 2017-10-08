package day07;

public class StaticDemo2{
    public static void main(String[] args) {
        Persion2.method();
        Persion2 p = new Persion2();
        p.show();
    }
}

class Persion2{

    private String name;
    private int age;
    public static String country = "CN";

    public Persion2(){
        
    }

    public Persion2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(Persion2.country+"  "+this.name+"  "+this.age);
    }

    public static void method(){
        System.out.println(Persion2.country);
    }

}