package day11;

public class ExceptionDemo6{
    public static void main(String[] args) {
        
    }
}
/* 
    �쳣��ע�����
    1�������ڸ��Ǹ��෽��ʱ������ķ�������׳����쳣����ô����ķ���ֻ���׳�������쳣���߸��쳣������
    2����������׳�����쳣����ô����ֻ���׳������쳣���Ӽ�
    ���า�Ǹ���ֻ���׳�������쳣������������Ӽ�
    ע�⣺�������ķ���û���׳��쳣����ô���า��ʱ���Բ����ף���ֻ��try
*/
class A extends Exception{

}

class B extends A{

}

class C extends Exception{

}

class Fu{

    void show() throws A{

    }

}

class Zi extends Fu{

    void show()throws B{

    }

}