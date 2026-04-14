package extendsPractice2;

public class Adminstaff extends employee {
    public Adminstaff() {
    }

    public Adminstaff(String id, String name, int age) {
        super(id, name, age);
    }
    public void work(){
        System.out.println("工作");
    }
}
