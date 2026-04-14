package myapiMath;

public class mathExercise2 {
    public static void main(String[] args) {


        //判断水花仙数,三位数,计算的是立方根
        int count=0;
        for (int i = 100; i <=999; i++) {
            double sum=0;
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
             sum=(Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3));
            if (i==sum){
                System.out.println(sum);
                count++;
            }
        }
        System.out.println(count);
        System.out.println("-----------------------------------------");

        //判断4叶玫瑰数
        int count1=0;
        for (int i = 1000; i <=9999; i++) {
            double sum=0;
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            int qian=i/1000%10;
            sum=(Math.pow(ge,4)+Math.pow(shi,4)+Math.pow(bai,4)+Math.pow(qian,4));
            if (i==sum){
                count1++;
            }
        }
        System.out.println(count1);
        System.out.println("--------------------------------------------");

        //判断五角星数
        int count2=0;
        for (int i = 10000; i <=99999; i++) {
            double sum=0;
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            int qian=i/1000%10;
            int wan=i/10000%10;
            sum=(Math.pow(ge,5)+Math.pow(shi,5)+Math.pow(bai,5)+Math.pow(qian,5)+Math.pow(wan,5));
            if (i==sum){
                count2++;
            }
        }
        System.out.println(count2);

        //判断没有2位数的自幂数
        System.out.println("-------------------------");
        int co=0;
        for (int i = 10; i <=100; i++) {
            double sum=0;
            int ge=i%10;
            int shi=i/10%10;

            sum=(Math.pow(ge,2)+Math.pow(shi,2));
            if (i==sum){
                co++;
            }
        }
        System.out.println(co);
        System.out.println("--------------------------");

    }
}
