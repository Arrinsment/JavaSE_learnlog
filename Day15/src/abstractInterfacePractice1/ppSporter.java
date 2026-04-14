package abstractInterfacePractice1;

public class ppSporter extends sporter implements English{


    public ppSporter() {
    }

    public ppSporter(int age, String name) {
        super(age, name);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习乒乓球");
    }

}
