public class StaticDemo2{
    public static void main(String[] args) {
        Persion.method();
        Persion p = new Persion();
        p.show();
    }
}

class Persion{

    private String name;
    private int age;
    public static String country = "CN";

    public Persion(){
        
    }

    public Persion(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println(Persion.country+"  "+this.name+"  "+this.age);
    }

    public static void method(){
        System.out.println(Persion.country);
    }

}