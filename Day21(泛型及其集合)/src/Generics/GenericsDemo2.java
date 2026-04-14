package Generics;

public class GenericsDemo2 {
    public static void main(String[] args) {

        MyArraylist<Integer> list=new MyArraylist<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
}
