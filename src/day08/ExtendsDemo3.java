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
        1�����أ�ͬһ������
        2�����ǣ������У�����Ҳ��Ϊ��д����д
*/

class Fu{
    void show(){
        System.out.println("Fu...");
    }
}

class Zi extends Fu{
    void show(){
        System.out.println("Zi...");
    }
}