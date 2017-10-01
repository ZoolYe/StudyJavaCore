public class ExceptionDemo5{
    public static void main(String[] args) {
        
        Demo d = new Demo();

        try {
            int num = d.show(-3);
        } catch (ArrayIndexOutOfBoundsException arr) {
            arr.printStackTrace();
            //System.exit(0);//�˳�jvm
        }finally{//ͨ�������ͷ���Դ
            System.out.println("finally");
        }
        System.out.println("over");
    }

    public static void show()throws Exception{
        throw new Exception();
    }

}

class Demo{

    public int show(int index)throws ArrayIndexOutOfBoundsException{
        
        int []arr = new int[3];
        //int []arr = new int[1024*1024*1024];

        if(index < 0){
            throw new ArrayIndexOutOfBoundsException("����Ǳ�Խ��");
        }
        return arr[index];
    }

}
/* 
    try-catch-finally���������ص㣺
    1,try catch finally
    2,try catch catch ... ��û�б�Ҫ��Դ��Ҫ�ͷ�ʱ�����Բ��ö���finally
    3,try finally   �쳣�޷�ֱ��catch����������Դ��Ҫ�ر�
*/