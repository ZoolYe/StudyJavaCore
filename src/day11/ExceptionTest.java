public class ExceptionTest{
    public static void main(String[] args) {

        Teacher t = new Teacher("����ʦ", new Computer());
        
        try{
            t.prelect();
        }catch(NoPlanException no){
            no.printStackTrace();
        }

    }
}

class Teacher{
   
    private String name;
    private Computer com;

    Teacher(String name,Computer com){
        this.name = name;
        this.com = com;
    }

    public void prelect()throws NoPlanException{
        try{
            this.com.run();
            System.out.println("��ʦ����");
        }catch(LanPingException lp){
            lp.printStackTrace();
            this.com.restart();
            prelect();
        }catch(MaoYanException my){
            my.printStackTrace();
            test();
            //throw my;
            throw new NoPlanException("��ʱ�����޷����:"+my.getMessage());
        }
        
    }

    public void test(){
        System.out.println("��ϰ������");
    }

}

class Computer{

    private int state = 2;
    public void run() throws LanPingException,MaoYanException{
        if(state==1){
            throw new LanPingException("����������");
        }
        if(state==2){
            throw new MaoYanException("����ð����");
        }
        System.out.println("��������");
    }

    public void restart(){
        state = 0;
        System.out.println("��������");
    }

}

//��������
class LanPingException extends Exception{

    LanPingException(){}
    
    LanPingException(String msg){
        super(msg);
    }

}

//����ð��
class MaoYanException extends Exception{
    MaoYanException(){}
    MaoYanException(String msg){
        super(msg);
    }
}

//��ʱ�޷�����
class NoPlanException extends Exception{
    
    NoPlanException(){}

    NoPlanException(String msg){
        super(msg);
    }
}