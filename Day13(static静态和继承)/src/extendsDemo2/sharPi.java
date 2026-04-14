package extendsDemo2;

public class sharPi extends dog{
    //注意看这里的沙皮狗 它吃饭的时候不仅吃狗粮,而且还在吃骨头,这明显和父类的 eat不一样所以我们要进行方法的重写
    //方法重写的时候要在前面加一个 @Override它会自动检查你重写的真确性


    @Override //这里可以输入你在父类中确定的方法名 自动跳出左边的部分
    public void eat() {
        super.eat();   //这里已经调用了父类中的eat了,我们只用在补充一个狗在啃骨头即可
        System.out.println("沙皮狗又在偷偷啃骨头");
    }
}
