public class ExtendsDemo3{
    public static void main(String[] args) {
        Zi z = new Zi();
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

class Fu{
     void show(){
        System.out.println("number...");
    }
}

class Zi extends Fu{
   public void show(){
       super.show();
       System.out.println("pic...");
       System.out.println("name...");
    }
}