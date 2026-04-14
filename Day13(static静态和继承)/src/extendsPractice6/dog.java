package extendsPractice6;



public class dog extends Animal {
    public  dog(){}
    public  dog(int age,String color){
        super(age,color);
    }

    @Override
    public String eat(String something) {
                return something;
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
