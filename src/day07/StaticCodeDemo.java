/* 
    ��̬�����
    ������ļ��ض�ִ�У�ִֻ��һ��

    ���ã�
    ���ڸ�����г�ʼ��
*/
public class StaticCodeDemo{
    public static void main(String[] args) {
        // new StaticCdoe().show();
        // new StaticCdoe().show();
        StaticCdoe sc = new StaticCdoe();
        sc.show();

        StaticCdoe sc2 = new StaticCdoe();
        sc2.show();
    }
}

class StaticCdoe{

    static{
        System.out.println("��̬�����");
    }

    {
        System.out.println("��������");
    }

    void show(){
        System.out.println("show...");
    }

}