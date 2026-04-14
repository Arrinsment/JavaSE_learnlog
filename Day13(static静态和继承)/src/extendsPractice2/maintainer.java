package extendsPractice2;

public class maintainer extends Adminstaff {
    public maintainer() {
    }

    public maintainer(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void work() {
        System.out.println("维护教学内部设备");
    }
}
