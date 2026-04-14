package polymorphisDemo1;

public class adminssor extends person {
    public adminssor() {
    }

    public adminssor(int age, String name) {
        super(age, name);
    }

    @Override

    public void show() {
        System.out.println("管理者");
    }
}

