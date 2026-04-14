package Exercise;

public class Exercise2 {
    public static void main(String[] args) {

        //这里我们写一个新的练习
        //就是你给定一个字符串,然后我们自己手动模拟  Integer.praseInt()
        //要求:

        //1.字符串只能是数字不能是其他字符
        //2.长度至少是1位,最多是10位
        //3.0不能是开头

        String str="25739514";

      //我们可以用正则表达式去判断
      //在实际开发中 我们习惯先把异常的数据过滤,那么留下的就是正确的数据了
        // 我们都先写出有特殊错误情况的,然后我们在写正确的
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("输入错误");
        }
        else{
            int number=0;
            for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i);
                int a=c-48;
                number=number*10+a;
            }
            System.out.println(number);//25739514
        }
    }
}
