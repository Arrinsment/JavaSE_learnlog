package 数组对象的练习;

public class Goodstest {
    public static void main(String[] args) {




        //创建一个 Goods 类型的数组


        Goods[]arr=new Goods[3];
        Goods R1=new Goods(001,"苹果手机",5999,100);//Ctrl+p 可以看里面
        Goods R2=new Goods(002,"华为手机",1000,100);
        Goods R3=new Goods(002,"oppo手机",1000,100);


        //创建商品对象
        arr[0]=R1;
        arr[1]=R2;
        arr[2]= R3;


       //获取
        for (int i = 0; i < arr.length; i++) {
            Goods good =arr[i];
            System.out.println(good.getName()+good.getId()+good.getCount()+good.getPrice());
        }
    }
}
