package day10;

public class DuoTaiDemo2{
    public static void main(String[] args) {

        ����ʦ x = new ����ʦ();
        x.����();
        x.����Ӱ();

        ����ү s = new ����ʦ();
        s.����();
        s.����();

        ����ʦ s1 = (����ʦ)s;
        s1.����Ӱ();
    }
}
/* 

*/

class ����ү{
    public void ����(){
        System.out.println("���� ����");
    }
    public void ����(){
        System.out.println("����");
    }
}

class ����ʦ extends ����ү {
    public void ����(){
        System.out.println("���� java");
    }
    public void ����Ӱ(){
        System.out.println("����Ӱ");
    }
}