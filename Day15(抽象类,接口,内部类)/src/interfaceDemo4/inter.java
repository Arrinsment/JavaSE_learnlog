package interfaceDemo4;

public interface inter {
    //这里我们选择使用静态类方法
    //public static 方法名 (实现参数){}
    //然后这个静态方法和默认方法 一样你不重写也不会报错
    //调用可以直接用接口名去调用,然后注意这里不能用 类名去调用或者创建对象去调用

    public static void show(){
        System.out.println("接口中的静态方法");
    }
}
