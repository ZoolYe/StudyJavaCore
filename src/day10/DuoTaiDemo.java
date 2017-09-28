public class DuoTaiDemo{
    public static void main(String[] args) {
        /* Cat c = new Cat();
        animalEat(c);
        Dog d = new Dog();
        animalEat(d); */

        Animal a = new Cat();//自动类型提升，猫对象提升了动物类型，但是特有功能无法访问  向上转型
        animalEat(a);

        //向下转型,向下转型的目的是为了使用子类中的特有方法
        Cat c = (Cat)a;
        c.catchMice();

        Dog d = new Dog();
        animalEat(d);

    }

    public static void animalEat(Animal a){
        a.eat();

        //instanceof：通常在向下转型前用于健壮性的判断
        if(a instanceof Cat){ //instanceof：用于判断对象的具体类型，只能应用于引用数据类型判断
            Cat c = (Cat)a;
            c.catchMice();
        }else if(a instanceof Dog){
            Dog d = (Dog)a;
            d.lockHome();
        }
        
    }

}
/* 
    对象的多态性：一个对象对应着不同的类型
    多态在代码中的体现：父类或者接口的引用指向其子类的对象
    多态的好处：提高了代码的扩展性，前期定义的代码可以使用后期的内容
    多态的弊端：前期定义的内容，不能使用后期子类的特有内容
    使用多态时的前提：1，必须有关系，继承，实现 2，要有覆盖
    注意：对于转型，自始至终都是子类对象在做着类型的变化
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