public class InterClassDemo6{
    public static void main(String[] args) {
        new Outer().method();
    }
}

class Outer{

    void method(){
        
        //��̬
        Object obj = new Object(){
            public void show(){
                System.out.println("object show");
            }
        };

        obj.show();//��Ϊ�����ڲ��������������ת��Ϊ��object���ͣ������Ͳ���ʹ���������еķ���

    }

}