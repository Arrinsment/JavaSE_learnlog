package interfacepRractice1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void swim() {
        System.out.println("狗在狗刨");
    }

    @Override
    public void eat() {
        System.out.println("屎");
    }
}
