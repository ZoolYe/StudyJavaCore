public class DuoTaiDemo3{
    public static void main(String[] args) {
        // Zi z = new Zi();
        // System.out.println(z.num);
        Fu f = new Zi();
        f.function();
    }
}

/* 
    ��̬ʱ���ص㣺
    ��Ա���ص㣺
    1����Ա������
        ����ʱ���ο������ͱ��������������Ƿ��е��õĳ�Ա������û�оͻ����ʧ��
        ����ʱ���ο������ͱ��������������Ƿ��е��õĳ�Ա�����������и��������еĳ�Ա����
        ��������ж��ο����

    2����Ա����(�Ǿ�̬)��
        ����ʱ���ο������ͱ��������������Ƿ��е��õĺ�����û�оͻ����ʧ��
        ����ʱ���ο����Ƕ��������������Ƿ��е��õĺ��������û�о����и���ĺ���
        ���뿴��ߣ����п��ұ�

    3����̬������
        ����ʱ���ο������ͱ��������������Ƿ��е��õľ�̬����
        ����ʱ���ο������ͱ��������������Ƿ��е��õľ�̬����
        ��������ж��ο���ߣ���ʵ���ھ�̬�������ǲ���Ҫ����ģ�ֱ�����������ü���
*/

class Fu{
    //int num = 3;
    public void show(){
        System.out.println("Fu...");
    }
    public static void function(){
        System.out.println("Fu...function");
    }
}

class Zi extends Fu{
    int num = 4;
    public void show(){
        System.out.println("Zi...");
    }
    public static void function(){
        System.out.println("Zi...function");
    }
}