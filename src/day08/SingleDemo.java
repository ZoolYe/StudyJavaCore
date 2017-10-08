package day08;

/*
    ���ģʽ����������֮��Ч�Ľ����ʽ����ʵ����һ��˼�롣
    1���������ģʽ
        ��������⣺���Ա�֤һ�������ڴ��еĶ���Ψһ��
        ���ڶ������ʹ��ͬһ��������Ϣ����ʱ������Ҫ��֤�ö����Ψһ��
        ��α�֤�����Ψһ��?
        1������������������new�����������
        2���ڸ����д���һ������ʵ��
        3�������ṩһ������������������Ի�ȡ�������
        ���裺
        1��˽�л����๹�캯��
        2��ͨ��new�ڱ����д����������
        3������һ�����еķ������������Ķ��󷵻�
*/
public class SingleDemo{
    public static void main(String[] args) {

        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1==s2);

        Test t1 =  Test.getInstance();
        Test t2 =  Test.getInstance();
        t1.setNum(10);
        t2.setNum(20);

        System.out.println(t1.getNum());
        System.out.println(t2.getNum());
    }
}

class Single{

    private Single(){}

    //��һ���أ�����ʹ��� ����ʽ
    private static Single s = new Single();

    public static Single getInstance(){
        return s;
    }
}

class Single2{

    private Single2(){}

    //����ؽ�����û�ж���ֻ�е�����getInstance����ʱ���Żᴴ������
    //�ӳټ�����ʽ  ����ʽ
    private static Single2 s = null;

    public static Single2 getInstance(){
        if(s==null){
            s = new Single2();
        }
        return s;
    }

}

class Test{

    private Test(){}

    private static Test t = new Test();

    public static Test getInstance(){
        return t;
    }

    int num;

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }

}