public class DuoTaiDemo{
    public static void main(String[] args) {
        /* Cat c = new Cat();
        animalEat(c);
        Dog d = new Dog();
        animalEat(d); */

        Animal a = new Cat();//�Զ�����������è���������˶������ͣ��������й����޷�����  ����ת��
        a.eat();

        //����ת��,����ת�͵�Ŀ����Ϊ��ʹ�������е����з���
        Cat c = (Cat)a;
        c.catchMice();
    }

    public static void animalEat(Animal a){
        a.eat();
    }

}
/* 
    ����Ķ�̬�ԣ�һ�������Ӧ�Ų�ͬ������
    ��̬�ڴ����е����֣�������߽ӿڵ�����ָ��������Ķ���
    ��̬�ĺô�������˴������չ�ԣ�ǰ�ڶ���Ĵ������ʹ�ú��ڵ�����
    ��̬�ı׶ˣ�ǰ�ڶ�������ݣ�����ʹ�ú����������������
    ʹ�ö�̬ʱ��ǰ�᣺1�������й�ϵ���̳У�ʵ�� 2��Ҫ�и���
    ע�⣺����ת�ͣ���ʼ���ն�������������������͵ı仯
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