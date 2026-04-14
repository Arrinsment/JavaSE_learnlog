package polymorphisDemo3;

public class Dog  extends Animal{
    @Override
    public void eat() {
        System.out.println("狗在吃屎");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
}
