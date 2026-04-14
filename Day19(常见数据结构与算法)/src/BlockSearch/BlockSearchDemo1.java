package BlockSearch;

public class BlockSearchDemo1 {
    public static void main(String[] args) {



        //然后 这里是对分块的第二种排序方式,就是无规律的排序方式
        //此时我们还是要进行分块分类,但唯一区别是增加一个最大与最小元素
        int []arr={16,5,9,12,21,18,
        32,23,37,26,45,34,
        50,48,61,52,73,66};
        int number=111;

        //可以从这个分块去看见,(1max:21),(2min:23,2max:45),(3min48,3max:73)
        //每个块的最大的都比旁边最小的小
        //我们要格外去创建一个类 ,Block

        Block b1=new Block(0,5,21);
        Block b2=new Block(6,11,45);
        Block b3=new Block(12,17,73);
        Block b4=new Block(0,0,-1);
       // System.out.println(b4);
        Block []block={b1,b2,b3,b4};

        //但我们要具体获取块数,这样才知道我要查找的数具体在什么索引里面

            Block b = getBlockIndex(block,number);

        for (int i = b.getStartIndex(); i <=b.getEndIndex(); i++) {

            if(arr[i]==number){
                System.out.println(i);
            }

        }
    }

    private static Block getBlockIndex(Block[] block, int number) {
        for (int i = 0; i < 3; i++) {
            if(number<=block[i].getMax()){
                return block[i];
            }
        }

        return block[3] ;
    }
}

class Block{


    private  int StartIndex;
    private  int EndIndex;
    private  int Max;

    public Block() {
    }

    public Block(int startIndex, int endIndex, int max) {
        StartIndex = startIndex;
        EndIndex = endIndex;
        Max = max;
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
}