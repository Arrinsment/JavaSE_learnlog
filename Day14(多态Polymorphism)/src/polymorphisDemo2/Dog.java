package polymorphisDemo2;

public class Dog extends Animal{
     String name="狗";

    @Override
    public void show() {
        System.out.println("Dog---show方法");
    }
}
