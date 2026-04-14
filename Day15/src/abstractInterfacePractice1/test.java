package abstractInterfacePractice1;

public class test {
    public static void main(String[] args) {
        ppSporter p1=new ppSporter(18,"小科科");
        p1.speakEnglish();
        p1.study();
        System.out.println(p1.getAge()+"的"+p1.getName()+"正在为国奋战");
    }
}
