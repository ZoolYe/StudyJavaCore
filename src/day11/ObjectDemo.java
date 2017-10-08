package day11;

public class ObjectDemo{
    public static void main(String[] args) {
        Persion p1 = new Persion(20);
        Persion p2 = new Persion(20);

        /* //==�Ƚϵ��ǵ�ֵַ
        System.out.println(p1==p2);
        //object���е�equals�Ƚϵ�Ҳ�ǵ�ַ
        System.out.println(p1.equals(p2));

        Demo d = new Demo();
        //p1.equals(d);

        System.out.println(p1);
        System.out.println(Integer.toHexString(p1.hashCode()));

        Class class1 = p1.getClass();
        Class class2 = p2.getClass();
        System.out.println(class1 == class2);
        System.out.println(class1.toString()); */

        Demo5 d = new Demo5();
        System.out.println(d.toString());

        //toString������ԭ��
        System.out.println(d.getClass().getName()+"!"+Integer.toHexString(d.hashCode()));
    }
}

/* 
    Object��������ĸ���
    Object�ǲ��ϳ�ȡ�����ģ��߱������ж��󶼾߱��Ĺ�������
    ���õĹ�������
*/
class Persion extends Object{

    private int age;
    public Persion(int age){
        this.age = age;
    }

/* 
    һ�㶼�Ḳ�Ǵ˷��������ݶ�����������ݣ������ж϶����Ƿ���ͬ������
*/
    public boolean equals(Object obj){

        if(obj instanceof Persion){
            Persion p = (Persion)obj;
            return this.age == p.age;
        }else{
            throw new ClassCastException("���ʹ���");
        }
    }

    public int hashCode(){
        return this.age;
    }

}

class Demo5{
    public String toString(){
        return "������"+this.getClass().getName()+" �ڴ��ַ��"+Integer.toHexString(hashCode());
    }
}