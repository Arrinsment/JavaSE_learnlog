package Threadmethod4;

public class ThreadDemo1 {

    public static void main(String[] args) {


        /*
         *  public static void yield()    // 出让线程/礼让线程    I
         */
        //yield 是产生,屈服,让步的含义

        Mythread t1=new Mythread();
        Mythread t2=new Mythread();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();

    }

}
