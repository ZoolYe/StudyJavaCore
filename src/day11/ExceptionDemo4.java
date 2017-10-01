public class ExceptionDemo4{
    public static void main(String[] args){
        int []arr = new int [3];
        arr = null;
        try{
            int num = method(arr, 2);
            System.out.println(num);
        }catch(Exception e){//��catch�����catch�ŵ�������
            e.printStackTrace();
        }catch(FuShuIndexException fu){
            System.out.println(fu.getMessage());
            System.out.println(fu);
            System.out.println("�����Ǳ��쳣");
            //jvmĬ�ϵ��쳣������ƾ��ǵ����쳣������������
            fu.printStackTrace();
        }catch(NullPointerException nullPointerException){
            System.out.println(nullPointerException.toString());
        }
        
    }
    public static int method(int []arr, int index)throws FuShuIndexException,NullPointerException{
        if(index < 0){
            throw new FuShuIndexException("����Ǳ겻��Ϊ����");
        }
        if(arr==null){
            throw new NullPointerException("û���κ�����ʵ��");
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
        �쳣�����ԭ��
        1�������ڲ�����׳���Ҫ�����쳣�������ϱ���Ҫ��������������ں�������try-catch��׽���������ʧ��
        2��������õ��������쳣�ĺ�����Ҫôtry-catchҪôthrows���������ʧ��
        3��ʲôʱ��catch��ʲôʱ��throws��
            �����ڲ����Խ����catch�����������throws�����ߵ����ߣ��ɵ����߽��
        4��һ�������׳��˶���쳣����ô����ʱ�������ж�Ӧ���catch��������ԵĴ���
    */