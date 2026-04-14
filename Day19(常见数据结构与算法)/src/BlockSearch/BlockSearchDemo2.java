package BlockSearch;

public class BlockSearchDemo2 {

    public static void main(String[] args) {
        int number=7;
    int [] arr={27,22,30,40,36
            ,13,19,16,20
            ,7,10
            ,43,50,48};

        //可以从这个分块去看见,(1max:21),(2min:23,2max:45),(3min48,3max:73)
        //每个块的最大的都比旁边最小的小
        //我们要格外去创建一个类 ,Block

        block b11=new block(0,4,40,22);
        block b22=new block(5,8,20,13);
        block b33=new block(9,10,10,7);
        block b44=new block(0,0,0,0);
        // System.out.println(b4);
        block []block={b11,b22,b33,b44};

        //但我们要具体获取块数,这样才知道我要查找的数具体在什么索引里面

        block b23 = getBlockIndex(block,number);

        for (int i = b23.getStartIndex(); i <=b23.getEndIndex(); i++) {

            if(arr[i]==number){
                System.out.println(i);
            }

        }
    }

    private static block getBlockIndex(block[] block, int number) {
        for (int i = 0; i < 3; i++) {
            if(number<=block[i].getMax()&&number>=block[i].getMin()){
                return block[i];
            }
        }

        return block[3] ;
    }
}
//这里的Block已经在BlockDemo1中看到了
class block{

    private  int StartIndex;
    private  int EndIndex;
    private  int Max;
    private  int Min;

    public block(int startIndex, int endIndex, int max, int min) {
        StartIndex = startIndex;
        EndIndex = endIndex;
        Max = max;
        Min = min;
    }

    public int getStartIndex() {
        return StartIndex;
    }

    public void setStartIndex(int startIndex) {
        StartIndex = startIndex;
    }

    public int getEndIndex() {
        return EndIndex;
    }

    public void setEndIndex(int endIndex) {
        EndIndex = endIndex;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int max) {
        Max = max;
    }

    public int getMin() {
        return Min;
    }

    public void setMin(int min) {
        Min = min;
    }
}


