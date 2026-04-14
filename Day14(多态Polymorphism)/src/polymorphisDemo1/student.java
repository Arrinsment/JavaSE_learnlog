package polymorphisDemo1;

public class student extends person {
    public student() {
    }

    public student(int age, String name) {
        super(age, name);
    }

    @Override
    public void show() {
        System.out.println("学生");
    }
}
