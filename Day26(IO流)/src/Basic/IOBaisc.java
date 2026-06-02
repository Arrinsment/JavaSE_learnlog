package Basic;

public class IOBaisc {

    //这里讲讲关于一些IO的一些基本知识
    //Java IO流家族关系
    //一句话总结
    //IO流 = 字节流（InputStream/OutputStream）+ 字符流（Reader/Writer），各分节点、处理两类。
    //
    //整体结构图
    //text
    //                    ┌─────────────────────────────────────┐
    //                    │            IO流（核心）              │
    //                    └──────────────┬──────────────────────┘
    //                                   │
    //            ┌──────────────────────┼──────────────────────┐
    //            │                      │                      │
    //            ▼                      ▼                      ▼
    //     ┌─────────────┐        ┌─────────────┐        ┌─────────────┐
    //     │  字节流      │        │  字符流      │        │  缓冲流      │
    //     │ InputStream │        │  Reader     │        │  处理流      │
    //     │ OutputStream│        │  Writer     │        │             │
    //     └─────────────┘        └─────────────┘        └─────────────┘
    //1. 字节流（处理二进制数据）
    //抽象父类	           子类	                     作用
    //InputStream	  FileInputStream	             读文件（字节）
    //                BufferedInputStream	         缓冲读，提高效率
    //                DataInputStream	             读基本数据类型（int, double等）
    //                ObjectInputStream	             读对象（反序列化）

    //OutputStream	  FileOutputStream	             写文件（字节）
    //                BufferedOutputStream	         缓冲写，提高效率
    //                DataOutputStream	             写基本数据类型
    //                ObjectOutputStream	         写对象（序列化）
    //                PrintStream	                 打印（System.out 就是这个）


    //2. 字符流（处理文本）
    //抽象父类	子类	                            作用
    //Reader	FileReader	                        读文本文件
    //          BufferedReader	                    缓冲读，readLine() 读一行
    //          InputStreamReader	                字节→字符（转换流，可指定编码）
    //          StringReader	                    读字符串

    //Writer   FileWriter	                        写文本文件
    //         BufferedWriter                       缓冲写，newLine() 换行
    //         OutputStreamWriter	                字符→字节（转换流，可指定编码）
    //         PrintWriter	                        打印（可写文件/网络，推荐用）
    //         StringWriter	                        写字符串



    //3. 字节流 vs 字符流
    //对比	           字节流	                            字符流
    //父类	      InputStream / OutputStream	           Reader / Writer
    //处理单位	  字节（byte）	                           字符（char）
    //适用场景	  图片、视频、音频、任意文件	               文本文件（.txt, .java, .xml）
    //常用子类	  FileInputStream, FileOutputStream	       FileReader, FileWriter

    //4. 节点流 vs 处理流
    //类型	     说明                       	例子
    //节点流     直接连接数据源（文件/网络/数组）	FileInputStream, Socket.getInputStream()
    //处理流	    包装节点流，增强功能	            BufferedInputStream, InputStreamReader


    //包装模式：
    // 节点流
    //FileInputStream fis = new FileInputStream("a.txt");
    //
    //// 处理流（包装节点流）
    //BufferedInputStream bis = new BufferedInputStream(fis);

    //6. 记忆口诀
    //字节读入 Input，字节写出 Output。
    //字符读入 Reader，字符写出 Writer。
    //File 连文件，Buffered 提效率。
    //InputStreamReader 转字符，BufferedReader 读一行。
    //
    //一句话
    //IO流家族 = 字节流（InputStream/OutputStream）+ 字符流（Reader/Writer），各分文件流、缓冲流、转换流等。网络编程用 Socket.getInputStream() 和 Socket.getOutputStream() 作为节点流，再套处理流。

}
