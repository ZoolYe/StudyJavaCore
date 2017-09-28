/* public class BookPC{
    
    这种设计没有扩展性，如果日后有新的设备时，需要修改BookPC的代码才能使用，不修改完全不能使用
    
    public static void main(String[] args) {
        System.out.println("bookpc run...");
        Mouse m = new Mouse();
        mouse(m);
        UPan u = new UPan();
        upan(u);
    }

    //使用鼠标
    public static void mouse(Mouse mouse){
        mouse.open();
        mouse.close();
    }

    //使用U盘
    public static void upan(UPan upan){
        upan.open();
        upan.close();
    }
}


//鼠标
class Mouse{
    public void open(){
        System.out.println("mouse open");
    }

    public void close(){
        System.out.println("mouse close");
    }
}

//U盘
class UPan{
    public void open(){
        System.out.println("upan open");
    }
    public void close(){
        System.out.println("upan close");
    }
} */

/* 
    提供一个接口规范后，日后的新设备只要按照这个接口进行设计的设备就可以使用了
*/
public class BookPC{
    public static void main(String[] args) {
        System.out.println("BookPC Run...");
        Mouse m = new Mouse();
        useUSB(m);
        UPan u = new UPan();
        useUSB(u);
    }

    //使用use接口的设备
    //接口类型的引用，用于接收(指向)接口的子类对象
    public static void useUSB(USB usb){
        usb.open();
        usb.close();
    }
}

//定义USB接口
interface USB{
    public abstract void open();
    public abstract void close();
}

//鼠标
class Mouse implements USB {
    public void open(){
        System.out.println("Mouse open");
    }
    public void close(){
        System.out.println("Mouse close");
    }
}

//U盘
class UPan implements USB{
    public void open(){
        System.out.println("UPan open");
    }
    public void close(){
        System.out.println("UPan close");
    }
}