package interfaceDemo4;

public class interimpl implements inter{

    //我在实现类中也创建一个,静态方法,同样也只能 接口名去调用
    public static void show(){
        System.out.println("实现类中的默认方法j");
    }
}
