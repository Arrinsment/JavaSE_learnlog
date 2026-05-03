package exception;

public class ExceptionDemo12 {
    public static void main(String[] args) {

        //throws: 写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会有哪些异常。
        //throw : 写在方法内，结束方法。手动抛出异常对象，交给调用者。方法中下面的代码不再执行了。
        //
        //需求：
        //定义一个方法数组的最大值

          int []arr={1,2,3,4,5,6,10,8};


          try{
              int a=get_Max(arr);
          }
          catch (NullPointerException e){
              System.out.println("空指针异常");
          }
          catch (ArrayIndexOutOfBoundsException e){
              System.out.println("索引越界异常");
          }


        System.out.println(get_Max(arr));//10


    }

    public static  int get_Max(int []arr) //编译时出问题就这样写:throws NullPointerException,ArrayIndexOutOfBoundsException{
    {
        //这里有个问题假如出入的是空数组,或者是null 那么则会出现报错,所以要去手动抛出异常
          if(arr==null){
              //手动创建一个异常对象，并把这个异常交给方法的调用者处理
              //此时方法就会结束，下面的代码不会再执行了
             throw  new NullPointerException();
          }
          if(arr.length==0){
              //手动创建一个异常对象，并把这个异常交给方法的调用者处理
              //此时方法就会结束，下面的代码不会再执行了
              throw new ArrayIndexOutOfBoundsException();
          }
        System.out.println("看看我执行了吗?");//如果数组长度为0或者为null,代码不会去执行

        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return  max;

        //一般都是抛出在调用处,然后调用处接收后,try catch 去执行
    }

    //虚拟机默认处理异常的方式:
    //一把异常信息以红色字体打印在控制台，并结束程序


    //二.捕获：try...catch
    //一般用在调用处，能让代码继续往下运行。

    //三.抛出：throw throws
    //在方法中，出现异常了。
    //方法就没有继续运行下去的意义了，采取抛出处理。
    //让该方法结束运行并告诉调用者出现了问题。
}
