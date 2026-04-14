package BasicSearch;

public class BasicSearchDemo1 {
    public static void main(String[] args) {

        // 算法与数据结构!

        //查找算法:1.基本查找(顺序查找)
        //核心:从0索引开始挨个往后找

        //需求:定义一个方法利用基本查找,查某个元素是否存在
        //数据如下{131,127,147,81,103,23,7,19}

        int number=19;
        int []arr=new int[]{131,127,147,81,103,23,7,19};

                   boolean a= basicSearch(arr,number);
        System.out.println(a);

        }
        public static boolean  basicSearch(int []arr,int number){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==number){
                    return  true;
                }
            }
                  return  false;
        }

    }

