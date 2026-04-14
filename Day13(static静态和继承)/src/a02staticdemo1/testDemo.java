package a02staticdemo1;

public class testDemo {
    public static void main(String[] args) {
        //编写一个测试类去调用
        int [] arr=new int[]{1,3,4,5};
        String s = Arrayutil.printArr(arr);
        System.out.println(s);

        double []arr1=new double[]{1.2,2.3,3.3,4.3,5.6,7.8};
        double aerage = Arrayutil.getAerage(arr1);
        System.out.println(aerage);
    }
}
