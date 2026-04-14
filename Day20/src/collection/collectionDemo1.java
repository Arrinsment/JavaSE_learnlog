package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo1 {
    public static void main(String[] args) {

/*
        public boolean add(E e)    添加
        public void clear()    清空
        public boolean remove(E e) 删除
        public boolean contains(Object obj) 判断是否包含
        public boolean isEmpty()    判断是否为空
        public int size()    集合长度

*/


      /*
        注意点：
        Collection是一个接口,我们不能直接创建他的对象。
        所以，现在我们学习他的方法时，只能创建他实现类的对象。
        实现类：ArrayList

        //目的：为了学习Collection接口里面的方法
        //自己在做一些练习的时候，还是按照之前的方式去创建对象。*/

        //Collection是ArrayList的祖先,这里利用多态,你传过来是什么样子,我就表现对应的行为即可
        Collection<String>coll =new ArrayList<>();


         //1.添加元素
        //细节1：如果我们要往List系列集合中添加数据，那么方法永远返回true，因为List系列的是允许元素重复的。
        //细节2：如果我们要往Set系列集合中添加数据，如果当前要添加的元素不存在，方法返回false，表示添加失败。
               //如果当前要添加的元素已经存在，方法返回false，表示添加失败。
               //因为Set系列的集合不允许重复。
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);//[aaa, bbb, ccc]//这里底层已经进行对toString方法重写所以结果不是地址值,而是类似数组那样


        //2.清空元素
        /*
        coll.clear();
        System.out.println(coll);//[]*/


        //3.删除
        //注意:因为Collection里面定义的是的是一些共性的方法,所以不能通过索引去删除,只能通过元素的对象进行删除
        //然后删除会返回一个boolean类型的值,删除成功返回true,删除失败返回false
        //如果删除的元素不存在则返回失败
        System.out.println(coll.remove("aaa"));//true
        System.out.println(coll);//[bbb, ccc]


        //4.判断元素是否包含
        //返回值是个boolean类型的包含返回true,存在返回true,不存在返回false
        System.out.println(coll.contains("aaa"));//false
        System.out.println(coll.contains("bbb"));//true
        //这里假如我们传入的是一个自定义基本数据类型,那怎么办,我们要重写equals方法,具体见 CollectionDemo2


        //5.判断元素是否为空?
        //返回值是个boolean类型的
        System.out.println(coll.isEmpty());//false

        //6.获取集合的长度
        System.out.println(coll.size());//2


    }
}
