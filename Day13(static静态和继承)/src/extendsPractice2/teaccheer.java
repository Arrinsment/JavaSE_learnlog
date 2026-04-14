package extendsPractice2;

public class teaccheer extends employee {
    public teaccheer() {
    }

    public teaccheer(String id, String name, int age) {
        super(id, name, age);
    }
    public void work(){
        System.out.println("在工作" );
    }
}
