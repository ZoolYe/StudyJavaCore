package day09;

public class FinalDemo{
    public static void main(String[] args) {
        
    }
}

/* 
    final�ؼ��֣�
    1��final��һ�����η������������࣬����������
    2��fianl���ε��಻���Ա��̳�
    3��final���εķ��������Ա�����
    4��fianl���εı�����һ��������ֻ�ܸ�ֵһ��
*/

class  Fu3{

    void show(){

    }

}

class Zi3 extends Fu3{
    final int sum = 10;
    //final int x;
    void show(){
        
    }
    void setSum(int sum){
        //this.sum = sum;
    }
}