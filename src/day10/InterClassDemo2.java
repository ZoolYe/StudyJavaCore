package day10;

public class InterClassDemo2{
    public static void main(String[] args) {
        Outer1.Inter oi = new Outer1().new Inter();
        oi.show();
    }
}
/* 
    Ϊʲô�ڲ�����ֱ�ӷ����ⲿ���еĳ�Ա�أ�
    ��Ϊ�ڲ���������ⲿ������� �ⲿ����.this
*/
class Outer1{
    int num = 5;

    class Inter{
        int num = 4;
        void show(){
            int num = 3;
            System.out.println(Outer1.this.num);
        }
    }
}