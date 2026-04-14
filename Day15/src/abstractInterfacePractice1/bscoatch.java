package abstractInterfacePractice1;

public class bscoatch extends coach{


    public bscoatch() {
    }

    public bscoatch(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练正在教学篮球");
    }
}
