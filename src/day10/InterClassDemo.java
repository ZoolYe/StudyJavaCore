public class InterClassDemo{
    public static void main(String[] args) {
        
        //ֱ�ӷ����ⲿ���е��ڲ����еĳ�Ա
        /* Outer o = new Outer();
        Outer.Inter i = o.new Inter();
        i.show();

        Outer.Inter oi = new Outer().new Inter();
        oi.show(); */
        
        //����ڲ����Ǿ�̬��
        Outer.Inter oi = new Outer.Inter();
        oi.show();

        //����ڲ����Ǿ�̬�ģ��ڲ����ԱҲ�Ǿ�̬��
        Outer.Inter.show();
    }
}

/* 
    �ڲ���ķ����ص㣺
        1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա
        2���ⲿ��Ҫ�����ڲ��࣬����Ҫ�����ڲ���Ķ���
    ��;��һ�����������ƣ���������ʱ�����ָ����������л����������������ﻹ�ڷ��ʱ��������������
        ��ʱ�Ͱѻ��е����ﶨ����ڲ���������

     ����ڲ����Ǿ�̬�ģ����൱����һ���ⲿ�࣬��Ϊ�ⲿ�����֮ǰ�ڲ�����Ѿ�������
     ����ڲ����ж����˾�̬��Ա�����ڲ���Ҳ�����Ǿ�̬��
*/
class Outer{
    private static int num = 10;
    //�ڲ���
    static class Inter{
        static void show(){
            System.out.println("show run  "+num);
        }
    }

    public void metion(){
        Inter i = new Inter();
        i.show();
    }

}