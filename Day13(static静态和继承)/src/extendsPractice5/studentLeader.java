package extendsPractice5;

public class studentLeader extends person {
    private String job;

    public studentLeader(){}

    public studentLeader(String job) {
        this.job = job;
    }

    public studentLeader(String name, String gender, int age, String nationality, String job) {
        super(name, gender, age, nationality);
        this.job = job;
    }

    @Override
    public void work() {
        System.out.println("学生干部喜欢开会!");
    }
}
