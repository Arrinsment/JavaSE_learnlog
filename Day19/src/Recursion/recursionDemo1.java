package Recursion;

public class recursionDemo1 {
    public static void main(String[] args) {


        //这里我们讲讲递归算法
        //递归:方法调用方法就是递归,但要注意这里要有出口


        //练习一:利用递归求1~100的和
        //这里求1`100 可以把100+(1`99), 求(99`1)可以看作99+(1`98),求(98`1)可以看作(1`97)以此类推.....1
        //定义方法 getSum求和


        //核心:1.找出口
        //2.找规律


        System.out.println(getSum(100));
    }

        public static int  getSum(int number){
        //出口就是当number=1的时候
        if(number==1){
            return 1;
        }
       return   getSum(number-1)+number;

    }
}
