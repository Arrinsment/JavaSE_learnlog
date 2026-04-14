package abstarctPractic1;

public class   Dog extends Animal {
    //这里因为 必须要继承动物 而如果你要用eat 就必须方法重写


    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }


    @Override //这里假如你不方法重写就一定会报错
    public void eat() {
        System.out.println("在吃屎");
    }
}
