package File;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileExercise6 {
    public static void main(String[] args) {
        /*
         需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
         打印格式如下：
         txt:3个
         doc:4个
         jpg:6个
    */
        /*
         * 作用：
         *    统计一个文件夹中每种文件的个数
         * 参数：
         *    要统计的那个文件夹
         * 返回值：
         *    用来统计map集合
         *    键：后缀名  值：次数
         *
         *    a.txt
         *    a.a.txt
         *    aaa（不需要统计的）
         *
               比如txt=2
               *   doc=3;
         */

        File f1=new File("D:\\aaa\\fff");

        Set<Map.Entry<String, Integer>> set = dfs(f1).entrySet();
        for (Map.Entry<String, Integer> entries : set) {
            System.out.println(entries.getKey()+"="+entries.getValue());
        }

    }
        public  static HashMap<String, Integer> dfs(File f1) {
            HashMap<String,Integer>hm=new HashMap<>();
            File[] files = f1.listFiles();
            for (File file : files) {
                if(file.isFile()){
                    String[] s = file.getName().split("\\.");
                    if(s.length>=2){
                        String s1=s[s.length-1];
                        if(hm.containsKey(s1)){
                            int count=hm.get(s1);
                            count++;
                            hm.put(s1,count);
                        }
                        else {
                            hm.put(s1,1);
                        }
                    }
                }
                else {
                    HashMap<String, Integer> dfs = dfs(file);
                    Set<Map.Entry<String, Integer>> set = dfs.entrySet();
                    for (Map.Entry<String, Integer> e : set) {
                        String key = e.getKey();
                        Integer value = e.getValue();
                        if (hm.containsKey(key)){
                            //包含这个这个键
                            Integer integer = hm.get(key);
                            hm.put(key,(integer+value));
                        }
                        else{
                            hm.put(key,1);
                        }
                    }
                }
            }
            return hm;
        }


}
