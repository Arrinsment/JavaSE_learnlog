package abstractInterfacePractice1;

public class PPcoatch extends coach implements English  {
    public PPcoatch() {
    }

    public PPcoatch(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练正在教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练正在学习英语");
    }
}
