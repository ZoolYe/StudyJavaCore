public class ExtendsDemo4{
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

/* 
    �Ӹ����еĹ��캯�����ص�
    �����๹�����ʱ�����֣��������๹�캯��ʱ������Ҳ������
    ��Ϊ�����๹�캯���еĵ�һ����һ��Ĭ�ϵ���ʽ���super()
    �����ʵ�������̣����������еĹ��캯��Ĭ�϶�����ʸ����еĿղ����Ĺ��캯��

    Ϊʲô����ʵ����Ҫ���ʸ����еĹ��캯����
    ����̳��˸��࣬��ȡ���˸����е�����(����)��������ʹ�ø���֮ǰ��
    ��Ҫ����������ζ��Լ������ݽ��г�ʼ���ģ����Ա�����ʸ���Ĺ��캯��

    ���������û�ж���ղ����Ĺ��캯������ô����Ĺ��캯��������super��ȷҪ���ø������ĸ����캯��
    ע�⣺super������Ҫ����������Ĺ��캯����һ��
*/

class Fu{
    int num;
    Fu(){
        num = 10;
        System.out.println("fu run");
    }
    Fu(int num){
        System.out.println("fu run"+num);
    }
}

class Zi extends Fu{
    Zi(){
        //super(12);
        //super();���õľ��Ǹ����еĿղ����Ĺ��캯��
        System.out.println("zi run"+num);
    }
    Zi(int num){
        System.out.println("zi run"+num);
    }
}