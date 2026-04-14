package extendsPractice2;

public class buyer extends Adminstaff {
    public buyer() {
    }

    public buyer(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void work() {
        System.out.println("采购物品");
    }
}
