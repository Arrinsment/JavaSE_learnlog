package extendsDemo1;

public class Animal {
    //本题主要是写一些常见的继承关系
    //画图找关系的时候从下往上找继承关系 ,然后写代码的时候从下往上系

    //另外如果你把 public改为了private 进行私有化 就无法在其他类进行调用了

     public void drink(){
         System.out.println("动物在喝水");
     }
     public void eat(){
         System.out.println("动物在吃饭");
     }
}
