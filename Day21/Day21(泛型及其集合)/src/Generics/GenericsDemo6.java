package Generics;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {

        ArrayList<Ye> list1=new ArrayList<>();
        ArrayList<Fu> list2=new ArrayList<>();
        ArrayList<Zi> list3=new ArrayList<>();
    }


    //为了保证我们传入的不同的对象可以被方法所接收,我们可以使用泛型<E>,但static后面也要加泛型
    public static void method(ArrayList<?extends Fu>list){

        //此时，泛型里面写的是什么类型，那么只能传递什么类型的数据。
        //
        //弊端：
        //利用泛型方法有一个小弊端，此时他可以接受任意的数据类型
        //Ye  Fu  Zi    Student
        //
        //希望：本方法虽然不确定类型，但是以后我希望只能传递Ye Fu Zi

        /*此时我们就可以使用泛型的通配符：
        ? 也表示不确定的类型,然后你用了这个过后就不用在static后面加<E>
        他可以进行类型的限定
        ? extends E: 表示可以传递E或者E所有的子类类型
        ? super E: 表示可以传递E或者E所有的父类类型    */

    }






}




class Ye{

}

class Fu extends Ye{

}

class Zi extends Fu{

}