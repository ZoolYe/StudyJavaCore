package day11;

import javax.swing.JFrame;

class ChuangKouChengXu extends JFrame{

    private ChuangKouChengXu(){
        this.setTitle("≥¬ù˜¥Û…µ±∆");
        this.setBounds(600, 500, 500, 500);
        this.setSize(580,600);
        this.setLocation(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private static ChuangKouChengXu cx = new ChuangKouChengXu();

    public static ChuangKouChengXu getInstance(){
        return cx;
    }
}

public class MainJF{
    public static void main(String[] args) {
        ChuangKouChengXu cx =  ChuangKouChengXu.getInstance();
    }
}