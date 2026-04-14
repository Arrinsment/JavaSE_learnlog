package StringDemo;

public class StringDemo4 {
    public static void main(String[] args) {
        //新建一个StringBuilder对象 ,然后返回值不是地址是属性,这个只是一个容器不是string的值

        //传入空白
        StringBuilder sb=new StringBuilder();
        System.out.println(); //因为是属性,所以打印的是空白,而不直接是地址

        //传入数据值
        StringBuilder sb1=new StringBuilder("abc");
        System.out.println(sb1);//abc

        //使用StringBuilder的成员方法
        //1.append()
         // sb1.append(1);
         // sb1.append("z");
         // sb1.append(false);
          //这里我们可以使用 链式编程:结果不用变量去接收,因为本身就是一个变量,直接用即可
        sb1.append(1).append("z").append(false);
        System.out.println(sb1);//abc1zfalse


      //  System.out.println(sb1);

        //2.reverse()
         sb1.reverse();
        System.out.println(sb1);//eslafz1cba

        //3.获取长度
         int a=sb1.length();
        System.out.println(a);//10

        //4.把 StringBuilder的容器里面的内容 利用toString 转化为String
        String sb2=sb1.toString();
        System.out.println(sb2);//eslafz1cba

    }
}
