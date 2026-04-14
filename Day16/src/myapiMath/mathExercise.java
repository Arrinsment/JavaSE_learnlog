package myapiMath;

public class mathExercise {
    public static void main(String[] args) {
        //判断质数
       if (isPrime(3)) {
           System.out.println("yes");
       }
       else{
           System.out.println("no");
       }
    }
    public static Boolean isPrime(int num){
        int count=0;
        //当小的和大的进行比较的时候会自动把小的转换为大的进行比较,比如int遇到double
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num%i==0){
                return false;
            }
            count++;
        }
        return true;
    }
}
