public class ExceptionDemo4{
    public static void main(String[] args){
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

class FuShuIndexException extends Exception{
    
        FuShuIndexException(){}
    
        FuShuIndexException(String msg){
            super(msg);
        }
    }

    /* 
        �쳣����Ĳ�׽��ʽ��
        ���ǿ��Զ��쳣��������Դ���ʽ��
        ��ʽ��
        try{
            ��Ҫ������쳣�Ĵ���
        }catch(�쳣�� ����){�ñ������ڽ��շ������쳣�Ķ���
            �����쳣�Ĵ���
        }finally{
            һ���ᱻִ�еĴ���
        }
    */