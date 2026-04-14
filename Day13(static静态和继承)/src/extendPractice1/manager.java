package extendPractice1;

public class manager extends employee {
    private int bouns;

    public manager() {
    }

    public manager(String id, String name, int age, int bouns) {
        super(id, name, age);
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理员工");
    }

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }
}
