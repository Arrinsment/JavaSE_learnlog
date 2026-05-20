package IOtest1;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.List;

public class test2 {
    public static void main(String[] args) {

        //利用删除包生成假数据，并写到文件当中

     //1.定义网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

     //2.爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

      //3.利用正则表达式获取数据
      //3.通过正则表达式，把其中符合要求的数据获取出来
        List<String> familyNameTemplist = ReUtil.findAll("(.{4})(\\.\\.)", familyNameStr, 1);
        List<String> boyNameTemplist = ReUtil.findAll("([\\w4E00-\u9FA5]{2})(\\.\\.)", boyNameStr, 1);
        List<String> girlNameTemplist = ReUtil.findAll("(\\.\\.){4}.*", girlNameStr, 0);

        System.out.println(familyNameTemplist);
        System.out.println(boyNameTemplist);
        System.out.println(girlNameTemplist);


        //后面的就差不多了
    }
}
