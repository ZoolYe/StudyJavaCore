public class ExtendsDemo2{

    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}
/* 
    ���Ӹ����У���Ա���ص�����
    1����Ա����
    2����Ա����
    3�����캯��

    _________________________________________

    1����Ա����
    ������ĳ�Ա�;ֲ�����ͬ����this����
    ���Ӹ����еĳ�Ա����ͬ����super���ָ���
    this��super���÷�������
    this������һ��������������
    super������һ������Ŀռ�
*/

class Fu{
    //�����Ա����˽���Ժ������ǲ���ֱ�ӷ��ʵ�
    private int num = 12;
}

class Zi extends Fu{
    int num = 13;
    void show(){
        System.out.println(num+"   "+super.num);
    }
}