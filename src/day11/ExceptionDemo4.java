public class ExceptionDemo4{
    public static void main(String[] args){
        int []arr = new int [3];

        try{
            int num = method(arr, -3);
            System.out.println(num);
        }catch(FuShuIndexException fu){
            System.out.println(fu.getMessage());
            System.out.println(fu);
            System.out.println("�����Ǳ��쳣");
            //jvmĬ�ϵ��쳣������ƾ��ǵ����쳣������������
            fu.printStackTrace();
        }
        
    }
    public static int method(int []arr, int index)throws FuShuIndexException{
        if(index < 0){
            throw new FuShuIndexException("����Ǳ겻��Ϊ����");
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