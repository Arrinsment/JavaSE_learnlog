package ThreadText3;

public class Mythread  extends  Thread{

    static int cnt=0;
    @Override
    public void run() {

        while (true){

            synchronized (Mythread.class){

                if(cnt+1<=100){
                    cnt++;
                    if (cnt%2!=0){
                        System.out.println(getName()+"输出了奇数:"+cnt);
                    }

                }else {
                    break;
                }

            }

        }

    }
}
