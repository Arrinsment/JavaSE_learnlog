package interfacepRractice1;

public class Frog extends Animal implements Swim{

    public Frog() {
    }

    public Frog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在喝水");

    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }
}
