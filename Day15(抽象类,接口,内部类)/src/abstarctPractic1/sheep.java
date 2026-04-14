package abstarctPractic1;

public class sheep extends Animal {


    public sheep() {
    }

    public sheep(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("羊在吃草");
    }
}
