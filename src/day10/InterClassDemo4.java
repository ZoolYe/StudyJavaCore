public class InterClassDemo4{
    public static void main(String[] args) {
        new Outer().show();
    }
}

/* 
    �����ڲ��࣬�����ڲ���ļ�д��ʽ
    ������ǰ�᣺�ڲ������̳л���ʵ��һ���ⲿ����߽ӿ�
    �����ڲ��ࣺ��ʵ����һ�������������
*/
class Outer{

    int num = 10;

    public void show(){

        new Demo(){
            void show(){
                System.out.println("�����ڲ���");
            }
        }.show();

    }

}

abstract class Demo{
    abstract void show();
}