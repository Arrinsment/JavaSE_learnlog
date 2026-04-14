package Generics;

public class GenericsDemo4 {

    public static void main(String[] args) {

        //假如我们确定了具体泛型,直接写方法名即可,其他不用管了
        //直接这样去写就可以了,其他就不用去管了
        MyArraylist2 list=new MyArraylist2();
        //接下来就是常规方法
        list.add("aaa");


        //但如果你是 public class  MyArraylist2 <E>implements List<>,你是这样不确定具体泛型,
        //你还是要去创建对象 MyArraylist2<String> list=new MyArraylist2();去创建对象
        //然后其他就是常规方法了



    }


}
