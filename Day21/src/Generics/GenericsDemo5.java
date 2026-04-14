package Generics;

public class GenericsDemo5 {

    public static void main(String[] args) {

        //泛型本身不具备继承性,但是数据具备继承性
       /*
        泛型不具备继承性，但是数据具备继承性
       */

        //创建集合的对象
        /*ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();*/

        //调用method方法
        //method(list1);
        //method(list2);
        //method(list3);

        /*list1.add(new Ye());
        list1.add(new Fu());   //调用方法发现只有只有ye这个类型可以传入
        list1.add(new Zi());*///此时，泛型里面写的是什么类型，那么只能传递什么类型的数据。
        /*


        但你正常这些都是可以直接传入的
         list.add(new ye())
         list.add(new fu())
         list.add(new zi())
         */


      /*  public static void method(ArrayList<Ye> list) {


    }*/

    }
}