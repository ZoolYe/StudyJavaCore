public class ExceptionDemo4{
    public static void main(String[] args){
        int []arr = new int [3];
        int num = method(arr, -3);
    }
    public static int method(int []arr, int index)throws FuShuIndexException{
        if(arr == null){
            throw new NullPointerException("请给定一个不为null的数组");
        }
        if(index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("没有这个元素");
        }
        if(index < 0){
            throw new FuShuIndexException("数组角标不能为负数");
        }
        if(arr == null){
            throw new NullPointerException("请给定一个不为null的数组");
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