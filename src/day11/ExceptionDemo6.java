package day11;

public class ExceptionDemo6{
    public static void main(String[] args) {
        
    }
}
/* 
    异常的注意事项：
    1，子类在覆盖父类方法时，父类的方法如果抛出了异常，那么子类的方法只能抛出父类的异常或者该异常的子类
    2，如果父类抛出多个异常，那么子类只能抛出父类异常的子集
    子类覆盖父类只能抛出父类的异常或者子类或者子集
    注意：如果父类的方法没有抛出异常，那么子类覆盖时绝对不能抛，就只能try
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