package exception;

public class ExceptionDemo6 {

    public static void main(String[] args) {

        /*
        自己处理（捕获异常）
        格式：
        try {
       可能出现异常的代码；
       } catch(异常类名 变量名) {
       异常的处理代码；
       }
       */
/*
        int []arr={1,2,3,4,5,6};
        System.out.println(arr[10]);//会出现异常:ArrayIndexOutOfBoundsException,然后下面的代码不会去执行
        System.out.println("看看我执行了吗?");*/


        int []arr={1,2,3,4,5,6};
        //现在去捕获异常
        try{
            System.out.println(arr[10]);//此处出现了异常，程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
                                        //new ArrayIndexOutOfBoundsException();
                                        //拿着这个对象到catch的小括号中对比，看括号中的变量是否可以接收这个对象
                                        //如果能被接收，就表示该异常就被捕获（抓住），执行catch里面对应的代码
                                        //当catch里面所有的代码执行完毕，继续执行try...catch体系下面的其他代码

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引下标越界");
        }
        System.out.println("看看我执行了吗?");
     //运行结果:
        //索引下标越界
        //看看我执行了吗?




    }
}
