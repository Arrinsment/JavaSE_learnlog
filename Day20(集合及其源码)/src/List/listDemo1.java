package List;

import java.util.ArrayList;
import java.util.List;

public class listDemo1 {
    public static void main(String[] args) {

        //List系列集合独有的方法：
        //void add(int index, E element) 在此集合中的指定位置插入指定的元素,这里的插入元素是指定索引的
        //E remove(int index) 删除指定索引处的元素，返回被删除的元素
        //E set(int index, E element) 修改指定索引处的元素，返回被修改的元素
        //E get(int index) 返回指定索引处的元素



        //1.创建一个集合
        List<String> list=new ArrayList<>();
        //1.在List集合中插入指定元素
       list.add("aaa");//0索引的
       list.add("bbb");//1索引的
       list.add("ccc");//2索引的


       //void add(int index, E element)
       //假如我在1索引处添加了一个元素,然后原来添加在这里的元素不会被替代,会依次往后面去移动

       /* list.add(1,"qqq");
        System.out.println(list);//[aaa, qqq, bbb, ccc]*/

        //2.删除元素:
       //E remove(int index) 删除指定索引处的元素，返回被删除的元素

       /* String remove = list.remove(2);
        System.out.println(remove);//bbb*/

        //然后这里有些关于remove的小细节,见listDemo


        //3.E set(int index, E element) 修改指定索引处元素，返回被修改的元素
        String S = list.set(0, "QQQ");
        System.out.println(list);//[QQQ, bbb, ccc]
        System.out.println(S);//aaa


        //4.E get(int index) 返回指定索引处的元素
        System.out.println(list.get(0));//QQQ


    }
}
