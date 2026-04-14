import java.util.ArrayList;

public class ArraylistDemo1 {

    public static void main(String[] args) {
        //Arraylist 是java中的集合,长度可变的一种容器
        //里面的数据类型 是引用数据类型,如果是基本数据类型要先变为包装类

        //1.创建集合对象
        //1.Arraylist 数据类型是泛型(E):就是对数据类型进行强制限制了:必须是引用数据类型或者是包装类

        //JDK7以前 2个<>内都必须写数据类型

       /* ArrayList<String> list= new ArrayList<String>();
        System.out.println(list);//[] 这是ArrayList 所默认的[]
        */

        // JDK以后的版本就不用了 只用在第一个[]中写了

        //这个Arraylist 是java在底层已经写好的类了
        //打印的时候不是地址值而是 集合中储存的内容
        //展示的时候会用[]进行包裹起来

        //1.创建一个集合
        ArrayList<String> list= new  ArrayList<>();
        System.out.println(list);

        //下面进行Arraylist 这个成员方法进行演示(增删查改)

        //1.boolean add(E e),添加元素 返回值`表示是否添加成功,但一般只要你正确添加了 一般都是成功的,所以一般不用写返回值
         boolean result = list.add("aaa");
                   list.add("bbb");
                   list.add("ccc");
                   list.add("ddd");
                   list.add("eee");
                   list.add("fff");
                   list.add("ggg");

        System.out.println(result);//true
        System.out.println(list);//[aaa, bbb, ccc, ddd, eee]

        //2.1. boolean remove(E e) 删除元素 返回值表示是否删除成功
        boolean result2=list.remove("aaa");
        System.out.println(result2);  //true
        System.out.println(list);     // [bbb, ccc, ddd, eee, fff, ggg]

        boolean result3=list.remove("bbb");
        System.out.println(result2);//true
        System.out.println(list);   // [ ccc, ddd, eee, fff, ggg]

        boolean result4=list.remove("AAA");
        System.out.println(result2); // false
        System.out.println(list);    //[ ccc, ddd, eee, fff, ggg]

        //2.2.E remove(index) 删除指定下标元素 注意这里返回值是删除下标的对应的元素

         String s =list.remove(0);//这里删除的是0对应的下标的元素 也就是"ccc",返回值(s)自然也是"ccc",没有[];
        System.out.println(s);   //ccc
        System.out.println(list);//[ddd, eee, fff, ggg]

        //3.E set(index,E X)修改指定下标的元素 ,把index下标的元素 修改为 E x,然后返回修改之前在这个位置的元素
        String S2 =list.set(0,"aaa");//这里的s2是原来的元素是 ddd
        System.out.println(S2);    //ddd
        System.out.println(list); //[aaa, eee, fff, ggg]

        //4. E get(index) 直接获取指定数组下标的元素
        String S3=list.get(0);
        System.out.println(S3);//这里的元素是aaa,没有[]因为我是直接往里面获取的元素

        //5. E size()获取集合的个数,也就是集合中元素的个数,就是相当于arr.length();
        int num=list.size();
        System.out.println(num);//[aaa, eee, fff, ggg] 所以是4个



    }

}
