package homeWork2;

public class tesst {
    public static void main(String[] args) {

        method(new newPhone());
        method(new oldphone());
    }

    public static void method (phone p){
        if(p instanceof oldphone O)
        {
            O.message();
            O.call();
        }
        else if (p instanceof  newPhone n){
            n.call();
            n.palygame();
            n.message();
        }
    }

}
