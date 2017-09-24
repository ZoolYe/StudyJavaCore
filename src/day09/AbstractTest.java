public class AbstractTest{
    public static void main(String[] args) {
        
    }
}
/* 
    ��Աʾ����
    ���󣺹�˾�г���Ա�����������ţ�нˮ����������
    ��Ŀ������������������ţ�нˮ�����н��𣬹�������
    �Ը�������������ݽ�ģ
*/

//������Ա
abstract class Employee{

    private String name;
    private String id;
    private double pay;

    Employee(String name,String id,double pay){
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public abstract void work();

}

//��������Ա
class Programmer extends Employee{

    Programmer(String name, String id, double pay){
        super(name, id, pay);
    }

    public void work(){
        System.out.println("programmer work");
    }

}

//��������
class Manager extends Employee{

    private double bonus;

    Manager(String name, String id, double pay, double bonus){
        super(name, id, pay);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("manager work");
    }

}