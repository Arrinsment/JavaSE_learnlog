package Stringtest;

public class 字符串拼接 {
    public static void main(String[] args) {
        //这里利用Strignbuilder 的拼接属性去拼接

        int[] arr = {1, 2, 3, 4};
        String s = arrToString(arr);
        System.out.println(s);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(',');
            }
        }
      String  s3= sb.append(']').toString();
        return s3;
    }
}
