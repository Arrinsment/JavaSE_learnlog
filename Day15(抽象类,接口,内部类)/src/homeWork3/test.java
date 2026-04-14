package homeWork3;

public class test {

    //调用方式一
    public static void main(String[] args) {
        Phone p=new Phone();
        p.playGame();


    //调用方式二 使用匿名内部类对象
        //可以直接在后面加 . 向我这样调用
         new IPlay(){

            @Override
            public void playGame() {
                System.out.println("我在玩游戏");

            }
        }.playGame();

             //也可以创建完实现类对象后 在赋值给接口让接口去调用
        //无论怎么样都是使用了多态思想 在不同的实现类中创建对象让接口去调用
        //这2种方式的本质不是一样的吗?都是创建了一个实现类,然后把实现类给接口,让接口去调用

     IPlay p3=new IPlay(){

            @Override
            public void playGame() {
                System.out.println("我在玩游戏吗");
            }
        };

    p3.playGame();

    }
}
