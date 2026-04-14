package interfaceDemo3;

public interface interA {

    //默认接口的格式public default 返回值 方法名(参数列表){}!和抽象类不一样了
    //这个加了的default的不用强制性重写,就是你接入这个infer 接口后 不要求你去强制性重写
    //但如果你要去重写请去掉 default 即可
    //这一点,有点难 如果创建了多个接口,然后这多个接口中有相同的默认方法,就必须强制要求实现类从重写

    public default void show(){
        System.out.println("抽象A里面的默认方法");
    }
}
