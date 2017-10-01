public class ExceptionTest{
    public static void main(String[] args) {

        Teacher t = new Teacher("毕老师", new Computer());
        
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
            System.out.println("老师讲课");
        }catch(LanPingException lp){
            lp.printStackTrace();
            this.com.restart();
            prelect();
        }catch(MaoYanException my){
            my.printStackTrace();
            test();
            //throw my;
            throw new NoPlanException("课时进度无法完成:"+my.getMessage());
        }
        
    }

    public void test(){
        System.out.println("复习，做题");
    }

}

class Computer{

    private int state = 2;
    public void run() throws LanPingException,MaoYanException{
        if(state==1){
            throw new LanPingException("电脑蓝屏了");
        }
        if(state==2){
            throw new MaoYanException("电脑冒烟了");
        }
        System.out.println("电脑运行");
    }

    public void restart(){
        state = 0;
        System.out.println("电脑重启");
    }

}

//电脑蓝屏
class LanPingException extends Exception{

    LanPingException(){}
    
    LanPingException(String msg){
        super(msg);
    }

}

//电脑冒烟
class MaoYanException extends Exception{
    MaoYanException(){}
    MaoYanException(String msg){
        super(msg);
    }
}

//课时无法继续
class NoPlanException extends Exception{
    
    NoPlanException(){}

    NoPlanException(String msg){
        super(msg);
    }
}