package Interator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class InteratorDemo1{

    public static void main(String[] args) {

       /* Collection系列集合三种通用的遍历方式：
        1. 迭代器遍历
        2. 增强for遍历
        3. lambda表达式遍历


        迭代器遍历相关的三个方法：
        Iterator<E> iterator()：获取一个迭代器对象
        boolean hasNext()：判断当前指向的位置是否有元素
        E next()：获取当前指向的元素并移动指针*/


        //1.创建集合并添加元素
        Collection<String>coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");


        //先创建一个迭代器,然后使用迭代器进行遍历
        //然后迭代器默认指向的是0索引处

           Iterator<String> it=coll.iterator();
        while (it.hasNext()){

            //判断从0索引处指针指向是否有元素,有元素进行移动
            String str = it.next();//指针记录当前元素,然后移动到下一个元素
            System.out.println(str);

        }

       //然后关于迭代器,还有几个小细节要注意:
        /*迭代器的细节注意点：
        1. 报错NoSuchElementException
        2. 迭代器遍历完毕，指针不会复位
        3. 循环中只能用一次next方法(假如你有多个,会出现报错,原来是记录一次移动一次,但2个it现在是记录一次,移动一次然后又记录一次,移动一次 ,我的意思这里的移动是强制性的,和只有一次next方法不一样)
        4. 迭代器遍历时，不能用集合的方法进行增加或者删除
        暂时当做一个结论先行记忆，在今天我们会讲解源码详细的再来分析。
        如果我实在要删除：那么可以用迭代器提供的remove方法进行删除。
        如果我要添加，暂时没有办法。*/


    }
}
