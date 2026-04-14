package extendsPractice3;

public class student extends joiner {
    public student() {
    }

    public student(int age, String name) {
        super(age, name);
    }


    @Override
    public void lookClassTable() {
        System.out.println("填写听课反馈");
    }
}
