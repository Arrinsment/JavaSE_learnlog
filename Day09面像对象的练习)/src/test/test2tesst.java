package test;

import java.util.Scanner;

public class test2tesst {
    public static void main(String[] args) {
        int sum=0;
        test2[] car = new test2[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < car.length; i++) {
            test2 MYcar=new test2();
            //从输出结果出发
            System.out.println("请输入你的品牌号码");
            String a = sc.next();
            MYcar.setBrand(a);
            System.out.println("请输入你的小车价格");
            int b = sc.nextInt();
            MYcar.setPrice(b);
            System.out.println("请输入你的小车颜色");
            String c = sc.next();
            MYcar.setColor(c);
           // System.out.println("品牌" + MYcar.getBrand() + "价格" + MYcar.getPrice() + "颜色" + MYcar.getColor());
             car[i]=MYcar;
            //把我写好的对象直接放在数组里面,最后在一起遍历数组
        }
        for (int i = 0; i < car.length; i++) {
            test2 car1=car[i];
            //计算平均价格
            sum+=car1.getPrice();
            //System.out.println("品牌" + car1.getBrand() + "价格" + car1.getPrice() + "颜色" + car1.getColor());
        }
        System.out.println(sum/3);

    }
}
