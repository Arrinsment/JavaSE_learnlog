package polymorphisDemo1;

public class teacher extends person{
    public teacher() {
    }

    public teacher(int age, String name) {
        super(age, name);
    }

    @Override
    public void show() {
        System.out.println("老师");
    }
}
