package Exercise;

public class Exercise3 {
    public static void main(String[] args) {

        //这个练习是我们自己去模拟Integer的to去自己模拟二进制

        //这里获取二进制的方法是除基取余法,就是一直往下除2 直到结果除到是0即可

        System.out.println(ToBinaryString(7));//111
    }

    private static String ToBinaryString(int number) {

        //这里的拼接我们选择的方式是StringBuilder,这里不是用的appeand了,而是用insert在前面放入一个0即可
        StringBuilder sb=new StringBuilder();
        while(number!=0){
            //它这里实际上是直接对2取模,然后每次都要去除以2,最后去把结果倒着拼接即可

           int c = number%2;

            sb.insert(0,c);
            number/=2;


        }

       return sb.toString() ;
    }
}