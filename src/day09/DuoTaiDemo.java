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
    ����Ķ�̬�ԣ�һ�������Ӧ�Ų�ͬ������
    ��̬�ڴ����е����֣�������߽ӿڵ�����ָ��������Ķ���
    ��̬�ĺô�������˴������չ�ԣ�ǰ�ڶ���Ĵ������ʹ�ú��ڵ�����
*/

abstract class Animal{
    abstract void eat();
}

class Dog extends Animal{
    public void eat(){
        System.out.println("���Զ���");
    }

    public void lockHome(){
        System.out.println("����");
    }

}

class Cat extends Animal{
    public void eat(){
        System.out.println("è�Զ���");
    }

    public void catchMice(){
        System.out.println("èץ����");
    }
}