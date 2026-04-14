package extendPractice1;

public class chef extends employee {
    public chef() {
    }

    public chef(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
