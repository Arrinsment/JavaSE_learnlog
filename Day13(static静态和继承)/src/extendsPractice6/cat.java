package extendsPractice6;

public class cat extends Animal {

    private String something;

    public cat() {
    }

    public cat(int age, String color) {
        super(age, color);
    }

    public String getSomething() {
        return something;
    }

    @Override
    public String eat(String something) {

               return something;
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
