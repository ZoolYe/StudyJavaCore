public class ThisDemo{
    public static void main(String[] args) {
        Persion p1 = new Persion("Сǿ",12);
        Persion p2 = new Persion("����",12);
        p1.speak();
        p2.speak();
        System.out.println(p1.comparAge(p2));
    }
}

/* 
    ����Ա�����;ֲ�����������������this�ؼ�������
    this������ǰ����
    this�������ں����������������
    ��˵���ĸ����������this���ڵĺ�����this�ʹ����ĸ�����

    thisҲ���������ڹ��캯���е����������캯��
    ע�⣺ֻ�ܶ����ڹ��캯���ĵ�һ�У���Ϊ��ʼ������Ҫ��ִ��
*/
class Persion{

    //����
    private String name;

    //����
    private int age;

    Persion(){
    }

    Persion(String name){
        this.name = name;
    }

    Persion(String name, int age){
        this(name);//������ڹ��캯���ĵ�һ��
        this.age = age;
    }

    public boolean comparAge(Persion persion){
        /* if(this.age==persion.age){
            return true;
        }
        return false; */
        return this.age == persion.age;
    }

    void speak(){
        System.out.println(this.name+"  "+this.age);
    }

}