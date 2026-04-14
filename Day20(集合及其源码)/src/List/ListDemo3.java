package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
    public static void main(String[] args) {

        //List系列集合的五种遍历方式：
        //1. 迭代器
        //2. 列表迭代器
        //3. 增强for
        //4. Lambda表达式
        //5. 普通for循环


        //创建一个集合对象,并添加元素
        List<String>list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.利用迭代器(Iterator)
          //创建一个迭代器对象
        Iterator<String> it= list.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
          //aaa
          //bbb
          //ccc


        //2.利用增强for循环
        //直接用list.for即可
        for (String s : list) {
            //这里的s只是一个第三方变量
            System.out.println(s);
        }

        //3.lambda表达式
        list.forEach( s-> System.out.println(s));

        //4.普通for的遍历方式
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //5.列表迭代器listIterator

        ListIterator<String> it1 = list.listIterator();
        while (it1.hasNext()){

            String str = it1.next();
            //这里和普通iterator相比可以添加元素
            //但这里的添加元素是用it.add

            if("aaa".equals(str)){
                it1.add("eee");

            }


            System.out.println(str);

        }

    }
}
