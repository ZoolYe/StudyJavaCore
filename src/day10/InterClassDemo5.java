package day10;

public class InterClassDemo5{
    public static void main(String[] args) {
        
        /* Inte i = new Inte(){
            public void show1(){
                System.out.println("�����ڲ���show1");
            }
            public void show2(){
                System.err.println("�����ڲ���show2");
            }
        };
        i.show1();
        i.show2();
        new Outer().method(); */

        useUsb(new USB1(){
            public void open(){
                System.out.println("��USB");
            }
        });

    }

    public static void useUsb(USB1 usb){
        usb.open();
    }

}

/* 
    ͨ��ʹ�ó���֮һ�������������ǽӿ�����ʱ�����ҽӿ��еķ��������������������������ڲ���
*/

interface Inte{
    abstract void show1();
    abstract void show2();
}

interface USB1{
    abstract void open();
}

class Outer4{

    class Inter implements Inte{

        public void show1(){
            System.out.println("�ڲ���show1");
        }

        public void show2(){
            System.out.println("�ڲ���show2");
        }

    }

    public void method(){
        Inter i = new Inter();
        i.show1();
        i.show2();
    }

}