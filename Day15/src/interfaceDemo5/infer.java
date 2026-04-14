package interfaceDemo5;

public interface infer {

    //为了去解决一些重复的代码,我们可以使用 接口当中的私有方法

    //1.如果是default的关键字的默认方法 我们可以使用private void 方法名(){}

    //2.如果是static 关键字的静态方法,我们可以使用private static  void 方法名(){}

    public default void show(){
        System.out.println("1111111");
        System.out.println("2222222");
    }
    public default void show2(){
        System.out.println("33333333");
        System.out.println("2222222");
    }

    //假如我要把 因为这里的22222222全部重复了,我肯定不能重复
    //所以以前新建了一个方法  show3 然后直接调用即可,但这里有个问题,外界可以直接调用这个方法?
    //所以jdk9更新了 把public 改为了 private 然后在把default删掉,为了避免重复我把方法名改为了show4,这样直接调用show4即可

    //在静态方法中的私有方法也是如此 直接把public 改为private即可(private public void show(){} )
    public default void show3(){
        System.out.println("222222222");
    }

    private  void show4(){
        System.out.println("222222222");
    }

}
