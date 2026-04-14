package extendsPractice6;

public class test {
    public static void main(String[] args) {
        cat C1=new cat(3,"黄色");
        person p1=new person();
        p1.KeepPet(C1,"小鱼干");
        System.out.println("--------------");
        dog d1=new dog(1,"黄色");
        p1.KeepPet(d1,"酱骨头");

    }
}
