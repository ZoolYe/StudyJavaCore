public class ExceptionDemo4{
    public static void main(String[] args){
        int []arr = new int [3];

        try{
            int num = method(arr, -3);
            System.out.println(num);
        }catch(FuShuIndexException fu){
            System.out.println(fu.getMessage());
            System.out.println(fu);
            System.out.println("负数角标异常");
            //jvm默认的异常处理机制就是调用异常对象的这个方法
            fu.printStackTrace();
        }
        
    }
    public static int method(int []arr, int index)throws FuShuIndexException{
        if(index < 0){
            throw new FuShuIndexException("数组角标不能为负数");
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
    */