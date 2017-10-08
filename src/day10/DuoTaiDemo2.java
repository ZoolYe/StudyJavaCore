package day10;

public class DuoTaiDemo2{
    public static void main(String[] args) {

        毕老师 x = new 毕老师();
        x.讲课();
        x.看电影();

        毕老爷 s = new 毕老师();
        s.讲课();
        s.钓鱼();

        毕老师 s1 = (毕老师)s;
        s1.看电影();
    }
}
/* 

*/

class 毕老爷{
    public void 讲课(){
        System.out.println("讲课 管理");
    }
    public void 钓鱼(){
        System.out.println("钓鱼");
    }
}

class 毕老师 extends 毕老爷 {
    public void 讲课(){
        System.out.println("讲课 java");
    }
    public void 看电影(){
        System.out.println("看电影");
    }
}