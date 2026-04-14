package Recursion;

public class recursionDemo2 {
    public static void main(String[] args) {

        //利用递归算法去求5的阶乘(factorialRecursion)
        //5*4!,4*3!...,3*2!,2*1!,1=1
        //把大问题拆解到小问题,然后你每次都更加接近出口1
        int number=5;

        System.out.println(getFactorialRecursion(5));
    }

    public static  int  getFactorialRecursion(int number){
        if(number==1){
            return 1;
        }

        return number*getFactorialRecursion(number-1);
    }
}
