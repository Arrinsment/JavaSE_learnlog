package extendsPractice3;

public class techer extends joiner {
    public techer() {
    }

    //这里只是生成一种构造方法便于你去传值
    public techer(int age, String name) {
        super(age, name);
    }

    @Override
    public void lookClassTable() {
        System.out.println("发布问题");
    }
}
