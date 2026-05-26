package waitandnodify;

public class foodie extends  Thread{
    @Override
    public void run() {

        ///*
        //* 1. 循环
        //* 2. 同步代码块
        //* 3. 判断共享数据是否到了末尾（到了末尾）
        //* 4. 判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
        //*/

        while(true){

          synchronized (Desk.lock){

              if (Desk.count==0){
                  break;
              }
              else {
                  //先去判断桌子上是否有面条
                  if(Desk.foodFlag==0){
                      //如果没有就去等待
                      //让当前线程和锁去绑定
                      //这里如果你以后要去唤醒,唤醒的是和这个锁绑定的所有对象
                      try {
                          Desk.lock.wait();//其实起到一个绑定作用,以后便于去唤醒被绑定的对象,而不是把虚拟机的所有对象都去唤醒
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                  }

                  else {

                      Desk.count--;
                      //如果有就开吃
                      System.out.println("吃货正在去吃第"+(10-Desk.count)+"碗!!!!");

                      //如果吃完就去叫厨师具体去做,唤醒厨师
                      Desk.lock.notifyAll();

                      Desk.foodFlag=0;//

                  }

              }
          }


        }

    }


}
