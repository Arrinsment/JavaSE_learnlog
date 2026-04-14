package abstarctPractic1;

public class Frog  extends Animal{
    public Frog() {
    }

    public Frog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
