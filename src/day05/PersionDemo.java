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

*/
    private int age;//˽�б�������

    private String name;

    //���캯��
    Persion(){
        System.out.println("���캯��");
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
        p.setAge(-2);
        p.speak();
    }
}