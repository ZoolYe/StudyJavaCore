/* public class BookPC{
    
    �������û����չ�ԣ�����պ����µ��豸ʱ����Ҫ�޸�BookPC�Ĵ������ʹ�ã����޸���ȫ����ʹ��
    
    public static void main(String[] args) {
        System.out.println("bookpc run...");
        Mouse m = new Mouse();
        mouse(m);
        UPan u = new UPan();
        upan(u);
    }

    //ʹ�����
    public static void mouse(Mouse mouse){
        mouse.open();
        mouse.close();
    }

    //ʹ��U��
    public static void upan(UPan upan){
        upan.open();
        upan.close();
    }
}


//���
class Mouse{
    public void open(){
        System.out.println("mouse open");
    }

    public void close(){
        System.out.println("mouse close");
    }
}

//U��
class UPan{
    public void open(){
        System.out.println("upan open");
    }
    public void close(){
        System.out.println("upan close");
    }
} */

/* 
    �ṩһ���ӿڹ淶���պ�����豸ֻҪ��������ӿڽ�����Ƶ��豸�Ϳ���ʹ����
*/
public class BookPC{
    public static void main(String[] args) {
        System.out.println("BookPC Run...");
        Mouse m = new Mouse();
        useUSB(m);
        UPan u = new UPan();
        useUSB(u);
    }

    //ʹ��use�ӿڵ��豸
    //�ӿ����͵����ã����ڽ���(ָ��)�ӿڵ��������
    public static void useUSB(USB usb){
        usb.open();
        usb.close();
    }
}

//����USB�ӿ�
interface USB{
    public abstract void open();
    public abstract void close();
}

//���
class Mouse implements USB {
    public void open(){
        System.out.println("Mouse open");
    }
    public void close(){
        System.out.println("Mouse close");
    }
}

//U��
class UPan implements USB{
    public void open(){
        System.out.println("UPan open");
    }
    public void close(){
        System.out.println("UPan close");
    }
}