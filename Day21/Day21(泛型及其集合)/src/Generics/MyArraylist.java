package Generics;

public class MyArraylist <E> {

        //<E>代表泛型未知
        //这里我们自己去写写 Arraylist 就是 Generics泛型那种
        //然后我们这里格外去创建一个 GenericsDemo2测试类

        Object[]obj=new Object[10];
        int size;


        //1.添加元素
        public boolean add(E e){
            obj[size]=e;
            size++;
            return true;
        }


       //2.利用 get去获取元素
       public E get(int index){
            return  (E)obj[index];
       }


}
