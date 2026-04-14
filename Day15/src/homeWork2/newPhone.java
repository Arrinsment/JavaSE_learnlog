package homeWork2;

public class newPhone extends phone implements IPlay{

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void message() {
        super.message();
    }

    @Override
    public void palygame() {
        System.out.println("打游戏");
    }
}
