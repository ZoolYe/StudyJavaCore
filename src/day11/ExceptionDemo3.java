public class ExceptionDemo3{
    public static void main(String[] args)throws FuShuIndexException{
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
/* 
    对于角标是正数不存在，可以用角标越界来表示
    对于负数为角标的情况，准备用负数角标异常来表示
    负数角标这种异常在Java中并没有定义过  只能自定义,这种自定义的问题描述称为自定义异常
    注意：如果让一个类成为异常类，必须要继承异常体系，因为只有成为异常体系的子类才具备可抛性

    异常的分类：
    1，编译时被检测异常：只要是Exception和其子类都是，除了特殊子类RuntimeException体系
        这种问题一旦出现，希望在编译时就进行检测，让这种问题有对应的处理方式(这样的问题都可以被处理)

    2，编译时不检测异常(运行时异常)：就是Exception中的RunException和其子类
        这种问题的发生无法让功能继续，运算无法进行，更多是因为调用者的原因导致的(这种问题一般不处理，在运行时
        让调用者调用时的程序强制停止)

    在自定义异常时，继承Exception 或者 继承RuntimeException
    throws 和 throw 的区别
    1，throws使用在函数上，throws抛出的是异常类，可以抛出多个，用逗号隔开
    2，throw使用在函数内，throw抛出的是异常对象
*/
class FuShuIndexException extends Exception{

    FuShuIndexException(){}

    FuShuIndexException(String msg){
        super(msg);
    }
}