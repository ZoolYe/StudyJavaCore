package day05;

class Persion{

/* 
    �˵����ԣ�
    ����

    �˵���Ϊ��
    ˵��

    private��˽�У���һ��Ȩ�����η����������γ�Ա��˽�е�����ֻ�ڱ�������Ч
    ע�⣺˽�н����Ƿ�װ��һ�����ֶ���

    ���캯���������������ʱ���õĺ��������ã����Ը�������г�ʼ����
    �������󶼱���Ҫͨ�����캯����ʼ��
    һ���������û�ж�������캯������ô�����л���һ��Ĭ�ϵĿղ����Ĺ��캯��
    ��������ж������ƶ��Ĺ��캯������ô���е�Ĭ�Ϲ��캯����û����

    һ�㺯���͹��캯��������
    ���캯�������󴴽�ʱ�ͻ������֮��Ӧ�Ĺ��캯�����Զ�����г�ʼ��
    һ�㺯�������󴴽�����Ҫ�ú�������ʱ�ŵ���

    ���캯�������󴴽�ʱ��ֻ����һ��
    һ�㺯�������󴴽��󣬿��Ա����ö��

    ʲôʱ���幹�캯����
    ����������ʱ��������һ���ھ;߱�һЩ���ݣ���Щ���ݶ������ڹ��캯����

*/
    private int age;//˽�б�������

    private String name;

    //���캯��
    Persion(){
        age = 1;
        name = "baby";
        //System.out.println("���캯��");
    }

    Persion(String name){
        this.name = name;
    }

    Persion(String name, int age){
        this.name = name;
        this.age = age;
    }

    Persion(int age, String name){
        this.age = age;
        this.name = name;
    } 

    //��������
    public void setAge(int age){
        if(age>0 && age<=130){
            this.age = age;
        }else{
            this.age = -1;
        }
    }

    //��ȡ����
    public int getAge(){
        return this.age;
    }

    //˵������
    void speak(){
        System.out.println(name+age);
    }

}

public class PersionDemo{
    public static void main(String[] args) {
        Persion p = new Persion();//���캯���������������ʱ���õĺ��������ã����Ը�������г�ʼ����
        //p.setAge(-2);
        Persion p1 = new Persion("����");
        p1.speak();
        p.speak();

        Persion p2 = new Persion("����",12);
        p2.speak();

        Persion p3 = new Persion(20,"sili");
        p3.speak();
    }
}