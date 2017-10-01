public class ExceptionDemo4{
    public static void main(String[] args){
        int []arr = new int [3];
        arr = null;
        try{
            int num = method(arr, 2);
            System.out.println(num);
        }catch(Exception e){//多catch父类的catch放到最下面
            e.printStackTrace();
        }catch(FuShuIndexException fu){
            System.out.println(fu.getMessage());
            System.out.println(fu);
            System.out.println("负数角标异常");
            //jvm默认的异常处理机制就是调用异常对象的这个方法
            fu.printStackTrace();
        }catch(NullPointerException nullPointerException){
            System.out.println(nullPointerException.toString());
        }
        
    }
    public static int method(int []arr, int index)throws FuShuIndexException,NullPointerException{
        if(index < 0){
            throw new FuShuIndexException("数组角标不能为负数");
        }
        if(arr==null){
            throw new NullPointerException("没有任何数组实体");
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
        异常处理的捕捉形式：
        这是可以对异常进行针对性处理方式：
        格式：
        try{
            需要被检测异常的代码
        }catch(异常类 变量){该变量用于接收发生的异常的对象
            处理异常的代码
        }finally{
            一定会被执行的代码
        }
        异常处理的原则：
        1，函数内部如果抛出需要检测的异常，函数上必须要声明，否则必须在函数内用try-catch捕捉，否则编译失败
        2，如果调用到了声明异常的函数，要么try-catch要么throws，否则编译失败
        3，什么时候catch，什么时候throws？
            功能内部可以解决用catch，解决不了用throws，告诉调用者，由调用者解决
        4，一个功能抛出了多个异常，那么调用时，必须有对应多个catch进行针对性的处理
    */