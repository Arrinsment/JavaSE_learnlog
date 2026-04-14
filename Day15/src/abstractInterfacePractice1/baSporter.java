package abstractInterfacePractice1;

public class baSporter extends sporter {

    public baSporter() {
    }

    public baSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习篮球");
    }
}
