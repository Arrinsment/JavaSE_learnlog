package 二维数组;

public class Array2dDemo1 {
    public static void main(String[] args) {

        //这里去讲讲java算法竞赛中的补充语法-->
        //一. 静态二维数组 int[][]arr=new int[n][m],这里的n和m可以是变量,和c/c++不同的地方
        //特点:
        //✅ 快、省内存、语法简单
        //❌ 大小固定，不能动态增删


        //一.定义
        //1.普通:int [][]arr1=new int[3][4];

        //2.直接定义:int [][]arr2={{1,2,3},{2,3,4}};

        //3.只去定义行不先去定义列:int [][]arr3=new int[3][];
        //arr3[0]=new int[2];把第一行去设置2个元素
        //arr3[1]=new int[5];把第二行去设置5个元素
        //arr3[2]=new int[10];把第三行去设置10个元素
        //第三种方法适合不规则数组


        //二.常见操作
        //int m=3;int n=4;
        //int [][]arr=new int[m][n];
        //1.获取行数
        // int rows=arr.length;
        //2.获取列数
        // int cols=arr[0].length;,这里要先去获取行数,在去获取列数
        //3.赋值
        //int x=10;
        //arr[i][i]=x;
        //4.取值
        //int y=arr[i][x];


       //三.遍历
        /*int [][]arr=new int [3][];
        arr[0]=new int[5];
        arr[1]=new int[8];
        arr[2]=new int[6];
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               arr[i][j]=1;
           }
       }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        //1 1 1 1 1
        //1 1 1 1 1 1 1 1
        //1 1 1 1 1 1

    }
}
