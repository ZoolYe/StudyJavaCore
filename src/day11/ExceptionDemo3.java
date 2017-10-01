public class ExceptionDemo3{
    public static void main(String[] args)throws FuShuIndexException{
        int []arr = new int [3];
        int num = method(arr, -3);
    }
    public static int method(int []arr, int index)throws FuShuIndexException{
        if(arr == null){
            throw new NullPointerException("�����һ����Ϊnull������");
        }
        if(index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("û�����Ԫ��");
        }
        if(index < 0){
            throw new FuShuIndexException("����Ǳ겻��Ϊ����");
        }
        if(arr == null){
            throw new NullPointerException("�����һ����Ϊnull������");
        }
        return arr[index];
    }
}
/* 
    ���ڽǱ������������ڣ������ýǱ�Խ������ʾ
    ���ڸ���Ϊ�Ǳ�������׼���ø����Ǳ��쳣����ʾ
    �����Ǳ������쳣��Java�в�û�ж����  ֻ���Զ���,�����Զ��������������Ϊ�Զ����쳣
    ע�⣺�����һ�����Ϊ�쳣�࣬����Ҫ�̳��쳣��ϵ����Ϊֻ�г�Ϊ�쳣��ϵ������ž߱�������

    �쳣�ķ��ࣺ
    1������ʱ������쳣��ֻҪ��Exception�������඼�ǣ�������������RuntimeException��ϵ
        ��������һ�����֣�ϣ���ڱ���ʱ�ͽ��м�⣬�����������ж�Ӧ�Ĵ���ʽ(���������ⶼ���Ա�����)

    2������ʱ������쳣(����ʱ�쳣)������Exception�е�RunException��������
        ��������ķ����޷��ù��ܼ����������޷����У���������Ϊ�����ߵ�ԭ���µ�(��������һ�㲻����������ʱ
        �õ����ߵ���ʱ�ĳ���ǿ��ֹͣ)

    ���Զ����쳣ʱ���̳�Exception ���� �̳�RuntimeException
    throws �� throw ������
    1��throwsʹ���ں����ϣ�throws�׳������쳣�࣬�����׳�������ö��Ÿ���
    2��throwʹ���ں����ڣ�throw�׳������쳣����
*/
class FuShuIndexException extends Exception{

    FuShuIndexException(){}

    FuShuIndexException(String msg){
        super(msg);
    }
}