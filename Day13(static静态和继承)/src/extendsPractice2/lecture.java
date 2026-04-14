package extendsPractice2;

public class lecture extends teaccheer {
    public lecture() {
    }

    public lecture(String id, String name, int age) {
        super(id, name, age);
    }
    @Override
    public void work() {
        System.out.println("上课");
    }
}
