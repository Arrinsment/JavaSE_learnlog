package ThreadText3;

public class text3 {

    public static void main(String[] args) {

        //同时开启两个线程，共同获取1-100之间的所有数字。
        //要求：输出所有的奇数

        Mythread t1=new Mythread();
        Mythread t2=new Mythread();

        t1.setName("人物一");
        t2.setName("人物二");

        t1.start();
        t2.start();

    }
}
