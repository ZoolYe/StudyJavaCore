package day11;

public class ExceptionDemo{
    public static void main(String[] args) {
        
        int [] arr = new int[1024*1024*1024];
        arr = null;
        System.out.println(arr[13]);
    }
}
/* 
    异常：是在运行时期发生的不正常情况
    在Java中用类的形式对不正常情况进行了描述和封装对象
    描述不正常的情况的类，就称为异常类
    以前正常流程代码和问题处理代码相结合
    现在将正常流程代码和问题处理代码分离，提高了阅读性
    其实异常就是Java通过面向对象的思想将问题封装成了对象
    用异常类对其进行描述
    不同的问题用不同的类进行描述
    问题很多，意味着描述的类也很多
    将其共性进行向上抽取，形成了体系
    
    最终问题分成了两大类
    Throwable:
        |--1，一般不可处理的 Error 特点：是由jvm抛出的严重性的问题 这种问题发生一般不正对性处理
        |--2，可以处理的 Exception
    
*/