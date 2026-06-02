package love18;

import java.util.Random;

public class testt {
    public static void main(String[] args) {
        Random R = new Random();
        int nextInt = R.nextInt(2);//[0,2)
        System.out.println(nextInt);
    }
}
