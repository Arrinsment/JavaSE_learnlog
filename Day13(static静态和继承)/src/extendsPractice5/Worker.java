package extendsPractice5;

public class Worker extends person {
    private String Unil;
    private int workAge;

    public Worker(){
    }

    public Worker(String unil, int workAge) {
        Unil = unil;
        this.workAge = workAge;
    }

    public Worker(String name, String gender, int age, String nationality, String unil, int workAge) {
        super(name, gender, age, nationality);
        Unil = unil;
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子!");
    }
}
