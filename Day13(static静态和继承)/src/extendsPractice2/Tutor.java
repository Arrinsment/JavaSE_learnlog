package extendsPractice2;

public class Tutor extends teaccheer {
    public Tutor() {
    }

    public Tutor(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void work() {
        System.out.println("课后帮助学生");
    }
}
