package waitandnodify;

public class Cook extends  Thread{

    @Override
    public void run() {

     while (true){

         synchronized (Desk.lock){

             // 判断桌子上是否有食物
             if (Desk.foodFlag==1){
                 // 如果有，就等待
                 try {
                     Desk.lock.wait();//绑定锁对象
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
           else {
                 // 如果没有，就制作食物
                 System.out.println("厨师做了一份食物");
                 // 修改桌子上的食物状态
                 Desk.foodFlag=1;
                 // 侥幸等待的消费者开吃
                 Desk.lock.notifyAll();

             }

         }
     }



    }
}
