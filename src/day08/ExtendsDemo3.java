package day08;

public class ExtendsDemo3{
    public static void main(String[] args) {
        Zi1 z = new Zi1();
        z.show();
        
    }
}

/* 
    ��Ա����
    ���Ӹ����г���ͬ����Ա���������������ຯ��
    �������󣬳�Ϊ���ǲ��������Ǻ������Ӹ����е�����
    �����������ԣ�
        1�����أ�ͬһ������ overload
        2�����ǣ������У�����Ҳ��Ϊ��д����д override
    ����ע�����
    1�����෽�����Ǹ��෽��ʱ������Ȩ�ޱ���Ҫ���ڵ��ڸ����Ȩ��
    2,��ֻ̬�ܸ��Ǿ�̬���򱻾�̬����

    ʲôʱ��ʹ�ø��ǲ�����
    ��һ��������������չʱ��������Ҫ��������Ĺ�������������
    Ҫ���������иù��ܵ���������ʱ����ʹ�ø��ǲ������
*/

class Fu1{
     void show(){
        System.out.println("number...");
    }
}

class Zi1 extends Fu1{
   public void show(){
       super.show();
       System.out.println("pic...");
       System.out.println("name...");
    }
}