public class ExtendsDemo4{
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

/* 
    子父类中的构造函数的特点
    在子类构造对象时，发现，访问子类构造函数时，父类也运行了
    因为在子类构造函数中的第一行有一个默认的隐式语句super()
    子类的实例化过程：子类中所有的构造函数默认都会访问父类中的空参数的构造函数

    为什么子类实例化要访问父类中的构造函数？
    子类继承了父类，获取到了父类中的内容(属性)，所以在使用父类之前，
    先要看父类是如何对自己的内容进行初始化的，所以必须访问父类的构造函数

    如果父类中没有定义空参数的构造函数，那么子类的构造函数必须用super明确要调用父类中哪个构造函数
    注意：super语句必须要定义在子类的构造函数第一行
*/

class Fu{
    int num;
    Fu(){
        num = 10;
        System.out.println("fu run");
    }
    Fu(int num){
        System.out.println("fu run"+num);
    }
}

class Zi extends Fu{
    Zi(){
        //super(12);
        //super();调用的就是父类中的空参数的构造函数
        System.out.println("zi run"+num);
    }
    Zi(int num){
        System.out.println("zi run"+num);
    }
}