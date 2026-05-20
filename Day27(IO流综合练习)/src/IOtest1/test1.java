package IOtest1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) throws IOException {


       /* 制造假数据：
        获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kgθ
        获取男生名字：http://www.haoming8.cn/baobao/10881.html
        获取女生名字：http://www.haoming8.cn/baobao/7641.html*/


        String famliynameNet="https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kgθ";
        String boynameNet="http://www.haoming8.cn/baobao/10881.html";
        String girlnameNet="http://www.haoming8.cn/baobao/7641.html";


        //这是网络爬虫的意思,就是去对应网址上去爬取对应的数据
        String famliynameStr=webcrower(famliynameNet);
        String boynameStr= webcrower(boynameNet);
        String girlnameStr= webcrower(girlnameNet);
        //System.out.println(famliynameStr);//这里如果你直接打印看到的是前端的代码,但如果你去百度看到的就是那些已经渲染好的数据那些


        //然后当然前端代码的数据很多,我们只要我想要的那些,不想要的那些就应该去舍弃,这里就可以用正则表达式去切割即可

        ArrayList<String> list = getDate(famliynameStr, "(\\W{4})(，|。)", 1);//这里的0代表全部,1代表前面的一组,2代表后的一组
        //System.out.println(list);//[子渠道号, 赵钱孙李, 周吴郑王, 冯陈褚卫, 蒋沈韩杨, 朱秦尤许, 何吕施张, 孔曹严华, 金魏陶姜, 戚谢邹喻, 柏水窦章, 云苏潘葛, 奚范彭郎, 鲁韦昌马, 苗凤花方, 俞任袁柳, 酆鲍史唐, 费廉岑薛, 雷贺倪汤, 滕殷罗毕, 郝邬安常, 乐于时傅, 皮卞齐康, 伍余元卜, 顾孟平黄, 和穆萧尹, 姚邵湛汪, 祁毛禹狄, 米贝明臧, 计伏成戴, 谈宋茅庞, 熊纪舒屈, 项祝董梁, 杜阮蓝闵, 席季麻强, 贾路娄危, 江童颜郭, 梅盛林刁, 钟徐邱骆, 高夏蔡田, 樊胡凌霍, 虞万支柯, 昝管卢莫, 经房裘缪, 干解应宗, 丁宣贲邓, 郁单杭洪, 包诸左石, 崔吉钮龚, 程嵇邢滑, 裴陆荣翁, 荀羊於惠, 甄曲家封, 芮羿储靳, 汲邴糜松, 井段富巫, 乌焦巴弓, 牧隗山谷, 车侯宓蓬, 全郗班仰, 秋仲伊宫, 宁仇栾暴, 甘钭厉戎, 祖武符刘, 景詹束龙, 叶幸司韶, 郜黎蓟薄, 印宿白怀, 蒲邰从鄂, 索咸籍赖, 卓蔺屠蒙, 池乔阴鬱, 胥能苍双, 闻莘党翟, 谭贡劳逄, 姬申扶堵, 冉宰郦雍, 郤璩桑桂, 濮牛寿通, 边扈燕冀, 郏浦尚农, 温别庄晏, 柴瞿阎充, 慕连茹习, 宦艾鱼容, 向古易慎, 戈廖庾终, 暨居衡步, 都耿满弘, 匡国文寇, 广禄阙东, 欧殳沃利, 蔚越夔隆, 师巩厍聂, 晁勾敖融, 冷訾辛阚, 那简饶空, 曾毋沙乜, 养鞠须丰, 巢关蒯相, 查后荆红, 游竺权逯, 盖益桓公, 万俟司马, 上官欧阳, 夏侯诸葛, 闻人东方, 赫连皇甫, 尉迟公羊, 澹台公冶, 宗政濮阳, 淳于单于, 太叔申屠, 公孙仲孙, 轩辕令狐, 钟离宇文, 长孙慕容, 鲜于闾丘, 司徒司空, 丌官司寇, 仉督子车, 颛孙端木, 巫马公西, 漆雕乐正, 壤驷公良, 拓跋夹谷, 宰父谷梁, 晋楚闫法, 汝鄢涂钦, 段干百里, 东郭南门, 呼延归海, 羊舌微生, 岳帅缑亢, 况郈有琴, 梁丘左丘, 东门西门, 商牟佘佴, 伯赏南宫, 墨哈谯笪, 年爱阳佟, 第五言福, 百家姓终, 经被定义]
        ArrayList<String> list2 = getDate(boynameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> list3 = getDate(girlnameStr, "(.. ){4}..", 0);

        ArrayList<String> familnamelist=new ArrayList<>();
        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                 familnamelist.add(s.charAt(i)+"");
            }
        }


        //把男生的名字进行去重
        ArrayList<String>boynamelist=new ArrayList<>();
        for (String str : list2) {
            if(!boynamelist.contains(str)){
                boynamelist.add(str);
            }
        }

        //把女生的名字进行
        ArrayList<String>girllist=new ArrayList<>();
        for (String s : list3) {
            String[] arr = s.split(" ");
            for (int i = 0; i < arr.length; i++) {
                girllist.add(arr[i]);
            }
        }

        //下面就开始去生成数据
        ArrayList<String> infos = getInfos(familnamelist, boynamelist, girllist, 50, 70);
        Collections.shuffle(infos);
        System.out.println(infos);

        //把文件写在本地文件夹去
        BufferedWriter bw= new BufferedWriter(new FileWriter("D:\\Javacode\\JavaSE_learnlog\\Day27(IO流综合练习)\\src\\IOtest1\\a.txt"));
        for (String s : infos) {
            bw.write(s);
            bw.newLine();
        }
         bw.close();
    }

    public static  ArrayList<String> getInfos( ArrayList<String> familnamelist, ArrayList<String>boynamelist, ArrayList<String>girllist,int boynum,int girlnum){

        //获取男生的名字
        HashSet<String> boys = new HashSet<>();

        while (true){
            if(boys.size()==boynum){
                break;
            }
            Collections.shuffle(familnamelist);
            Collections.shuffle(boynamelist);
            boys.add(familnamelist.get(0)+boynamelist.get(0));

        }
        System.out.println(boys);

        //获取女生的名字
        HashSet<String> girls = new HashSet<>();

        while (true){
            if(girls.size()==girlnum){
                break;
            }
            Collections.shuffle(familnamelist);
            Collections.shuffle(girllist);
            girls.add(familnamelist.get(0)+girllist.get(0));

        }
        System.out.println(girls);
        Random s=new Random();
        ArrayList<String>list=new ArrayList<>();

        for (String boy : boys) {
            int r = s.nextInt(10)+18;
            list.add(boy+"-"+"男"+"-"+r);
        }


       for(String girl:girls){
           int r=s.nextInt(8)+18;
           list.add(girl+"-"+"女"+"-"+r);
       }

        return list;
    }

       public static ArrayList<String>getDate(String s,String regex,int index){

          ArrayList<String>list=new ArrayList<>();
           Pattern p = Pattern.compile(regex);

           Matcher m = p.matcher(s);

           while (m.find()){
               list.add(m.group(index));
           }

         return list;
       }

         public static String webcrower(String net) throws IOException {

             //创建一个StringBuilder对象,用来拼接数据
             StringBuilder sb = new StringBuilder();

             //创建一个URL对象,这个对象就是像输入框一样去输入网址的
             URL url = new URL(net);//传入的就是一个网址

             //然后你传入了网址,让还要确保网站可以去打开才行,创建一个网路连接对象,然后用URL去打开连接
             URLConnection conn = url.openConnection();

             //然后就去读取数据,因为网站的数据很多,全部01,bit/byte那些的字节流,所以还要去用转换流转换一下
             InputStreamReader isr = new InputStreamReader(conn.getInputStream());

             int b;

             while ((b = isr.read()) != -1) {

                 sb.append((char) b);
             }
             return  sb.toString();
         }

}
