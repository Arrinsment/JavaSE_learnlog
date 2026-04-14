package interfaceDemo3;

public interface interB {

    public default void show(){
        System.out.println("抽象B里面的默认方法");
    }
}
