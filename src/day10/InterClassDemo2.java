public class InterClassDemo2{
    public static void main(String[] args) {
        Outer.Inter oi = new Outer().new Inter();
        oi.show();
    }
}
/* 
    Ϊʲô�ڲ�����ֱ�ӷ����ⲿ���еĳ�Ա�أ�
    ��Ϊ�ڲ���������ⲿ������� �ⲿ����.this
*/
class Outer{
    int num = 5;

    class Inter{
        int num = 4;
        void show(){
            int num = 3;
            System.out.println(Outer.this.num);
        }
    }
}