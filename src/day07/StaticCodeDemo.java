package day07;

/* 
    ��̬�����
    ������ļ��ض�ִ�У�ִֻ��һ��
    ���ã�
    ���ڸ�����г�ʼ��
*/
public class StaticCodeDemo{

    static{
        System.out.println("man static code");
    }

    public static void main(String[] args) {
        new StaticCdoe().show();
        new StaticCdoe().show();
        StaticCdoe.show();
    }
}

class StaticCdoe{

    static{
        System.out.println("��̬�����");
    }

    //�������飬���Ը����ж�����г�ʼ��
    {
        System.out.println("��������");
    }

    static void show(){
        
        System.out.println("show...");
    }

}