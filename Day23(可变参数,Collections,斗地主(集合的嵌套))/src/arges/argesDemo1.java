package arges;

public class argesDemo1 {
    public static void main(String[] args) {


        //这里的arges 是可变参数的含义
        //这里讲讲什么是可变参数,假如你要对n个数进行求和:比如1,2,3,4....n个数进行求和但你并不知道具体有几个数
        //此时就可以用可变参数进行求和

        //JDK5
        //可变参数
        //方法形参的个数是可以发生变化的，0 1 2 3 ...
        //格式：属性类型...名字
        //比如:int...args,主义中间是三个点,...;

        //现在我们随机对一些数字进行求和
        System.out.println(getSum(1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 23));//83

    }

      //这个可变参数 Java底层是一个数组,Java底层已经给我们写好了
    public  static int getSum(int...arges){
           int sum=0;
        for (int a : arges) {
            sum+=a;
        }

        return sum;
    }



}
