public class ExceptionDemo5{
    public static void main(String[] args) {
        
        Demo d = new Demo();

        try {
            int num = d.show(-3);
        } catch (ArrayIndexOutOfBoundsException arr) {
            arr.printStackTrace();
            //System.exit(0);//退出jvm
        }finally{//通常用于释放资源
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
            throw new ArrayIndexOutOfBoundsException("数组角标越界");
        }
        return arr[index];
    }

}
/* 
    try-catch-finally代码块组合特点：
    1,try catch finally
    2,try catch catch ... 当没有必要资源需要释放时，可以不用定义finally
    3,try finally   异常无法直接catch处理，但是资源需要关闭
*/