package day09;

public class ExtendsDemo5{
    public static void main(String[] args) {
        Zi2 z = new Zi2();
        z.show();
    }
}

/* 
    һ������ʵ��������
    Persion p = new Persion();
    1��jvm��ȡָ��·���µ�xxx.class�ļ��������ؽ��ڴ�,�����ȼ���Persion�ĸ���(�����ֱ�Ӹ���)
    2���ڶ��ڴ��п��ٿռ䣬�����ڴ��ַ
    3�����ڶ���ռ��У��Զ����е����Խ���Ĭ�ϳ�ʼ��
    4�����ö�Ӧ�Ĺ��캯�����г�ʼ��
    5���ڹ��캯���У���һ�л��ȵ��ø����й��캯�����г�ʼ��
    6�������ʼ����Ϻ��ٶ���������Խ�����ʾ��ʼ��
    7���ٽ������๹�캯�����ض���ʼ��
    8����ʼ����Ϻ󣬽���ֵַ��ֵ�����ñ���
*/

class Fu2{
    
    Fu2(){
        super();
        show();//������show����ʱִ������show����
        return;
    }
    void show(){
        System.out.println("fu show");
    }
}

class Zi2 extends Fu2{
    
    int num = 8;

    Zi2(){
        super();
        /* >>ͨ��super��ʼ����������ʱ������ĳ�Ա������δ��ʾ��ʼ������super()�����ʼ����Ϻ�
            �Ž�������ĳ�Ա������ʾ��ʼ�� */
        System.out.println("zi cons run "+num);
        return;
    }
    void show(){
        System.out.println("zi show"+num);
    }
}