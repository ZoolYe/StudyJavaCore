package day10;

public class InterClassDemo3{
    public static void main(String[] args) {
        new Outer2().method();
    }
}
/* 
    �ڲ�����Դ���ھֲ�λ����
    �ڲ����ھֲ�λ����ֻ�ܷ��ʾֲ��б�final���εľֲ�����
*/
class Outer2{

    int num = 4;

    void method(){

        int x = 110;
        
        class Inter{
            
            void show(){
                //int num = 10;
                System.out.println("Inter show ");
            }
        }
        Inter i = new Inter();
        i.show();
    }
}