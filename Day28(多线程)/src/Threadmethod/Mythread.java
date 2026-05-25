package Threadmethod;

public class Mythread extends Thread{

    //重写run方法
    //假如你没有设置名字而是去直接调用getName,返回的是Thread-x的形式

    //设置名字,除了用set去设置名字,还可以用构造方法去设置名字
    //但构造方法不能继承,要去申明


    public Mythread() {
    }

    public Mythread(String name) {
        //代表的是继承父类的名字
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

         /*   try {
         //因为Thread父类没有抛出异常,子类也没有,只有自己try-catch
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }//每次循环都会睡觉5秒后去打印*/

            System.out.println(getName());
        }
    }

}
