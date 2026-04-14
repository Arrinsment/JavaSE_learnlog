package StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值的方式获取一个字符串
        String name ="雄安";
        System.out.println(name);

        //2.使用new的方式去使用一个字符串
            //1.使用空参构造:可以创造一个空白的字符串的对象
               String S1=new String();
               System.out.println("@"+S1+"!");//@!

           //传递一个字符串 根据传递的内容再创建一个字符串(脱了裤儿放屁)
               String s2=new String("AND");
               System.out.println(s2);

          //传递一个字符数组,根据字符数组的内容在创建一个新的字符串对象
          //需求:我要修改字符串的内容 abc-->Abc;
          //abc-->{'a','b','c'}-->{'A','b','c'}
               char[]s3={'a','b','c','d'};
               String A=new String(s3);
               System.out.println(A);

         //传递一个字节数组,根据字节数组的内容在创建一个新的字符串对象
           byte[] s4={ 97,99,100,101 };//97对应的是小写的a,ASCII码值;
           String S5=new String(s4);

    }
}
