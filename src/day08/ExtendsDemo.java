package day08;

public class ExtendsDemo{

    public static void main(String[] args) {

        Student s = new Student();
        s.name = "��ɾ";
        s.age = 15;
        s.study();
    }
    

}

/* 
    �̳еĺô���
        1������˴���ĸ�����
        2����������֮������˹�ϵ����������������̬�ṩ��ǰ��
    Java��֧�ֵ��̳У���ֱ��֧�ֶ�̳�
    ���̳У�һ������ֻ����һ��ֱ�Ӹ���
    ��̳У�һ����������ж��ֱ�Ӹ���(��Java�в�����������������)
        ��ֱ��֧������Ϊ�����������ʱ�Ĳ�ȷ����
        ��Java����ͨ��"��ʵ��"�ķ�ʽ�����ֵ�

    Java��֧�ֶ��̳�
    c�̳�b��b�̳�a
    ��Ҫʹ��һ���̳���ϵʱ
    1���鿴����ϵ�еĶ����࣬�˽����ϵ�Ļ�������
    2����������ϵ�������������ɹ��ܵ�ʹ��

    ʲôʱ����̳У�
    ��������֮�������������ϵ��ʱ��Ͷ���̳У�xxx��yyy�е�һ�֣��Ϳ��Լ̳�
*/

class Persion{
    //����
    String name;
    //����
    int age;
}

class Worker extends Persion{

    void work(){

    }

}

class Student extends Persion{

    void study(){
        System.out.println(this.name+"    "+this.age);
    }
}