package day10;

public class InterClassDemo5{
    public static void main(String[] args) {
        
        /* Inte i = new Inte(){
            public void show1(){
                System.out.println("匿名内部类show1");
            }
            public void show2(){
                System.err.println("匿名内部类show2");
            }
        };
        i.show1();
        i.show2();
        new Outer().method(); */

        useUsb(new USB1(){
            public void open(){
                System.out.println("打开USB");
            }
        });

    }

    public static void useUsb(USB1 usb){
        usb.open();
    }

}

/* 
    通常使用场景之一：当函数参数是接口类型时，而且接口中的方法不超过三个，可以用匿名内部类
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
            System.out.println("内部类show1");
        }

        public void show2(){
            System.out.println("内部类show2");
        }

    }

    public void method(){
        Inter i = new Inter();
        i.show1();
        i.show2();
    }

}