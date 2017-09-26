public class InterfaceDemo{
    public static void main(String[] args) {
        DemoImpl d = new DemoImpl();
        /* System.out.println(d.NUM);
        System.out.println(DemoImpl.NUM);
        System.out.println(Demo.NUM); */
        Test2 t = new Test2();
        t.show();
    }
}
/* 
    ��һ���������еķ������ǳ����ʱ����ʱ���Խ��ó���������һ����ʽ����ͱ�ʾ�����ǽӿ� Interface
    ����ӿ�ʹ�õĹؼ��ֲ���class����Interface
    ���ڽӿڵ��г����ĳ�Ա��������Щ��Ա���й̶������η�
    1��ȫ�ֳ�����public static final
    2�����󷽷���public abstract
    �ӿ��еĳ�Ա���ǹ�����Ȩ��
*/
interface Demo{
    public static final int NUM = 10;
    public abstract void show1();
    public abstract void show2();

}

interface A{
    public abstract void show();
}

interface B{
    public abstract int add(int a,int b);
}

class Test implements A,B{
    public void show(){

    }
    public int add(int a,int b){
        return a+b;
    }
}

/* 
    ������֮���Ǽ̳й�ϵ������ӿ�֮����ʵ�ֹ�ϵ
    �ӿڲ�����ʵ����
    ֻ����ʵ���˽ӿڵ����ಢ�����˽ӿ������еĳ��󷽷��󣬸�����ſ���ʵ����
    ��������������һ��������
*/


class DemoImpl implements Demo{

    public void show1(){

    }

    public void show2(){

    }
}
/* 
    ��Java�в�ֱ��֧�ֶ�̳У���Ϊ����ֵ��õĲ�ȷ����
    ����Java����̳л��ƽ����˸�������Java�б���˶�ʵ��
    һ�������ʵ�ֶ���ӿ�
    һ�����ڼ̳���һ�����ͬʱ��������ʵ�ֶ���ӿ�
*/
class Q{
    void function(){
        System.out.println("Q...");
    }
}

class Test2 extends Q implements A,B{
    public void show(){
        super.function();
    }

    public int add(int a, int b){
        return a+b;
    }
}

//�ӿ���ӿ�֮���Ǽ̳й�ϵ
interface CC{
    public abstract void show1();
}

interface BB{
    public abstract void show2();
}

interface QQ extends BB,CC{
    public abstract void show3();
}

class HH implements QQ{

    //��Ҫ������������
    public void show1(){

    }

    public void show3(){

    }

    public void show2(){

    }
}