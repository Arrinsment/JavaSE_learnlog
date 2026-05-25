package Threadcase3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    //这里在Callable后面写了一个Integer的泛型, 通过泛型 <Integer>，就是提取明确指定了 call() 方法返回的是整数类型
    @Override
    public Integer call() throws Exception {

        //求1-100的和
      int sum=0;

      for(int i=1;i<=100;i++){
          sum+=i;
      }
      return  sum;
    }


}
