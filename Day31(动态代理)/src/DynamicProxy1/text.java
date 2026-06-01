package DynamicProxy1;

public class text {

    public static void main(String[] args) {

        /*
      需求：
      外面的人想要大明星唱一首歌
      1. 获取代理的对象
      代理对象 = ProxyUtil.createProxy(大明星的对象);
      2. 再调用代理的唱歌方法
      代理对象.唱歌的方法("只因你太美");
       */

        //一.获取代理的对象
        BigStar bigStar = new BigStar("鸡哥");
        star s= proxyUtil.createProxy(bigStar);
        String res = s.sing("鸡你太美");
        System.out.println(res);
                     s.dance();

       //准备话筒，收钱
        //鸡哥正在唱鸡你太美
        //谢谢
        //准备场地，收钱
        //鸡哥正在跳舞


    }

}
