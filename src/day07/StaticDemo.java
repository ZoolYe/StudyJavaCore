package day07;

public class StaticDemo{
    int num = 4;
    public static void main(String[] args) {
        //System.out.println(Persion.country);
        //new Persion().show();
        new StaticDemo().show();
        new Persion().show();
    }

    public void show(){
        System.out.println(num);
    }
}


/* 
    static���ص㣺
    1��static��һ�����η����������γ�Ա
    2��static���εĳ�Ա�����еĶ���������
    3��static�����ڶ�����ڣ�static��Ա������ļ��ض�����
    4��static���εĳ�Ա����һ�ֵ��õķ�ʽ������ֱ�ӱ�����������  ��ʽ:����.��̬��Ա
    5��static���ε������ǹ������ݣ������д洢������������

    ��Ա�����;ֲ�����������
        ���ֱ������������ڲ�ͬ
    1����Ա�������Ŷ���Ĵ��������ڣ����Ŷ�����ͷŶ���ʧ
        ��̬����������ļ��ض����ڣ����������ʧ����ʧ

    2�����÷�ʽ��ͬ
        ��Ա����ֻ�ܱ��������
        ��̬�������Ա�������ã������Ա���������

    3�����ݴ洢λ�ò�ͬ
        ��Ա�������ݴ洢�ڶ��ڴ�Ķ�����
        ��̬�������ݴ洢�ڷ�����(��̬����)������Ҳ�й�������

    ��̬ʹ�õ�ע�����
    1����̬����ֻ�ܷ��ʾ�̬��Ա��(�Ǿ�̬�ȿ��Է��ʾ�̬���ֿ��Է��ʷǾ�̬)
    2����̬�����в�����ʹ��this����spuer�ؼ���
    3���������Ǿ�̬��

*/
class Persion{

    private String name;//��Ա������ʵ������
    public static String country = "CN";//��̬�����������
    private int age;

    public void show(){
        System.out.println(this.name);
        System.out.println(Persion.country);
    }

}