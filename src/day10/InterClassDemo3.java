public class InterClassDemo3{
    public static void main(String[] args) {
        new Outer().method();
    }
}
/* 
    内部类可以存放在局部位置上
    内部类在局部位置上只能访问局部中被final修饰的局部变量
*/
class Outer{

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