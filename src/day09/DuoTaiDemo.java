public class DuoTaiDemo{
    public static void main(String[] args) {
        Cat c = new Cat();
        animalEat(c);

        Dog d = new Dog();
        animalEat(d);
    }

    public static void animalEat(Animal a){
        a.eat();
    }

}
/* 
    对象的多态性：一个对象对应着不同的类型
    多态在代码中的体现：父类或者接口的引用指向其子类的对象
    多态的好处：提高了代码的扩展性，前期定义的代码可以使用后期的内容
*/

abstract class Animal{
    abstract void eat();
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃东西");
    }

    public void lockHome(){
        System.out.println("看家");
    }

}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃东西");
    }

    public void catchMice(){
        System.out.println("猫抓老鼠");
    }
}