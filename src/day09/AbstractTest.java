public class AbstractTest{
    public static void main(String[] args) {
        
    }
}
/* 
    雇员示例：
    需求：公司中程序员有姓名，工号，薪水，工作内容
    项目经理除了有姓名，工号，薪水，还有奖金，工作内容
    对给出需求进行数据建模
*/

//描述雇员
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

//描述程序员
class Programmer extends Employee{

    Programmer(String name, String id, double pay){
        super(name, id, pay);
    }

    public void work(){
        System.out.println("programmer work");
    }

}

//描述经理
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