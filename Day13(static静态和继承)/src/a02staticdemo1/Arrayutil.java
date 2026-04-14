package a02staticdemo1;

public class Arrayutil {

    // 定义一个工具类,去帮助我们解决问题,但不帮我们描述任何事物的类

    //先对这个私有化,防止用户创建对象,创建对象没有什么意义,然后如果你要调用的话,直接类名调用即可
    private Arrayutil() {
    }

    //然后开始去编写具体工具内容,提供一个工具类 printArr 用于返回数组的具体内容,就是类似这种 [1,2,3,4]

    public static String printArr(int []arr){
        StringBuilder sb=new StringBuilder();
          sb.append("[");
        for (int i = 0; i < arr.length; i++) {

            if(i==arr.length-1) {
                sb.append(arr[i]);//老师这里的判断是用i去当索引的,不要用sb.length去想,因为是变化的
            }
            else{
                sb.append(arr[i]).append(",");//集合长度用size(),字符串用length()m
                 }
        }
        sb.append("]");
        return sb.toString();
    }

  // 编写一个getAerage的方法用于返回平均分这里用double 浮点数类型的

    public static double getAerage(double []arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}