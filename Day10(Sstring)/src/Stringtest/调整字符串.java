package Stringtest;

public class 调整字符串 {
    public static void main(String[] args) {
        //题目要求 给定2个字符串,其中一个字符串不停旋转,就是不停往后边移动,然后和右边的字符串进行比较
        //如str1="abcd"->bcda->cdab->dabc->abcd,然后和str2="cdab"进行比较

        //直接定义2个字符串
        String str = "abcd";
        String str2 ="abcdA";
        int len=str.length();
        //定义一个字符串 旋转的方法rotate
        //这个部分虽然我我写出来,但感觉有点像屎山代码
        //他是只要有一次满足条件就直接返回true 全部看完了没有满足条件的才返回false

      while(len!=0) {
          str = rotate(str);
          System.out.println(str);
          boolean falg = StringCheck(str, str2);
          if (falg) {
              System.out.println("是旋转字符串");
              break;
          }
          len--;
      }
      if(len==0){
          System.out.println("不是旋转字符串");
      }
        //为了方便比较这里在创建一个比较方法 StringCheck
    }

    public static Boolean StringCheck(String  str, String str2) {
        if (str2.equals(str)) {
            return true;
        }
        return  false;
    }
        /*public static String rotate (String S){
            //这里旋转的方式 我采用的方法一:substing 把第一个字符截取下来放在最后
            String S1 = S.substring(0, 1);
            String S2 = S.substring(1);
            String S3 = S2 + S1;
            return S3;
        }*/

        //这里我们使用 第二种方法 字符串数组的方法进行拼接
        //然后直接进行交换
        public static String rotate (String S){
               StringBuilder sb=new StringBuilder();
               char [] c = S.toCharArray();//a b c d
               char first =c[0];
            for (int i = 1; i < c.length; i++) {
                      c[i-1]=c[i];
                      sb.append(c[i-1]);
            }
            sb.append(first);
            return  sb.toString();
        }
}
