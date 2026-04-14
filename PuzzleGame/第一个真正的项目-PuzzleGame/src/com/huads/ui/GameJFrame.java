package com.huads.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {


    //然后开始写选项中的内容
    JMenuItem restartGame=new JMenuItem("重新游戏");
    JMenuItem resatrtLogin=new JMenuItem("重新登录");
    JMenuItem exitGame=new JMenuItem("退出游戏");


    JMenuItem girl=new JMenuItem("美女");
    JMenuItem animal=new JMenuItem("动物");
    JMenuItem sport =new JMenuItem("运动");

    //开始写栏目上关于我们的内容
    JMenuItem publicArtical=new JMenuItem("不要点开");
    //JFrame是父类 那么自然gameJFrame就是子类,继承所有
    //规定把说有和游戏主体相关的,包括游戏主界面框架,移动图片那些都放在这里面

    //但因为这里面全部都是空白所以我们要先进行 界面设置

    //这里直接利用构造方法直接进行初始化即可 进行设置即可
    //相当于我在APP中创建对象的它就直接调用,然后生成主界面

    int [][]arrdata=new int[4][4];//定义在成员位置,下面的就都可以用了

    //这里在写个win数组进行,最后代码的比较
    int [][]win=new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
    };

    //记录空白方快 在二维数组中的位置
    int x=0;
    int y=0;

    //我们为游戏添加一个计算步数的功能
    int step=0;

    String path="D:\\\\自己写的小程序\\\\image\\\\animal\\\\animal3\\\\";

    public GameJFrame(){

        //初始化菜单
        initFrame();

        //初始化菜单栏
        initJMenuBar();


        //先初始化数据,在初始化图片,不然图片里面全部是空的
        initData();

        //初始化图片,就是往界面里面添加图片
        initImage();



        //

        //利用setVisible,并给其true的值让其可被看见,false表示不被看见,建议放在最后面
        this.setVisible(true);




    }

    private void initData() {

        //就是拼图游戏,图片打乱?
        //利用一维数组即可以,我们先把一维数组进行随机打乱,然后把它定义为二数组即可

        int []arr=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        //随机打乱
        Random sc=new Random();
        for (int i = 0; i < arr.length; i++) {
            int index=sc.nextInt(arr.length);
            int temp=0;
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
      /*  for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //方式一: 然后把一维数组变成二维数组
       /* int num=0;
        for (int i = 0; i < arrdata.length; i++) {
            for (int j = 0; j < arrdata.length; j++) {
                arrdata[i][j] = arr[num];
                num++;
            }
        }*/


        //方式二: 把一维数组变成二维数组
        for (int i1 = 0; i1 < arr.length; i1++) {

            //这里主要是得到具体0的位置
            if(arr[i1]==0){
                x=i1/4;
                y=i1%4;
            }
            /*else {
                //这里不能这样写,如果你这样写,你第二次遇到0会自动跳过
                arrdata[i1 / 4][i1 % 4] = arr[i1];
            }*/
            arrdata[i1 / 4][i1 % 4] = arr[i1];
        }

    }


    //初始化图片,就是往界面里面添加图片
    private void initImage() {


        //清空已经加载完的所有图片
        this.getContentPane().removeAll();

        //为游戏添加一个计数器功能:JLable除了被用来管理图片容器,也可以直接用来添加文字
        JLabel j22=new JLabel("步数:"+step);
        j22.setBounds(50,30,100,200);
        this.getContentPane().add(j22);
        this.repaint();

          if(victory()){
              JLabel jwin=new JLabel(new ImageIcon("D:\\自己写的小程序\\image\\win.png"));
              jwin.setBounds(203,283,197,73);
           this.getContentPane().add(jwin).repaint();

          }



        //这里主要用到了2个对象 imageIcon  JLabel(管理图片的容器)

        //把图片的地址放在这里面,这里添加的文件路径是以字符串的形式添加的
        // ImageIcon icon =new ImageIcon("D:\\自己写的小程序\\image\\animal\\animal3\\1.jpg");

        //然后把放好的图片对象名字放在JLable里面即可



        //这里其实可以完全变成一行即可,
      //  JLabel jLabel=new JLabel (new ImageIcon("D:\\自己写的小程序\\image\\animal\\animal3\\1.jpg"));

        //它这里是按照坐标的方式去添加代码的,我们可以使用一个时间复杂度为2的循环
        //内循环是管行的,外循环是管列的

      for(int i=0;i<4;i++) {
          for (int j = 0; j < 4; j++) {
              int num1=arrdata[i][j];
              JLabel jL = new JLabel(new ImageIcon(path+num1+".jpg"));

              //设置坐标放置位置,我是先通过ImageIcon 创建完对象后 放在JLabel 这个容器,然后 每个都是独立的,只是恰好拼接在了一起
              //现在要把图片整体进行平移,然后这里不是用数组来写的,
              jL.setBounds(105 * j+83, 105*i+134, 105, 105);

              //接下来我们要把,那些单独的照片 加一些边框,这里调用到的是 setBorder
              //我们传入的对象是 new BevelBorder(),这里面如果传入的是0(RAISED):就是凸起 ,传入的是1(LOWERED):就是凹下去

              //Bevel 是斜的/斜面的意思

              jL.setBorder(new BevelBorder(1));
              this.getContentPane().add(jL);


          }
      }

       //然后接下来我们 为照片添加背景图,这有个注意事项,先加载的照片会放在最上面,后加载的会放在下面,
        // 所以我们要在添加完拼图图片后,在往下面添加背景图片
        ImageIcon I1=new ImageIcon("D:\\自己写的小程序\\image\\background.png");

       //然后我们这里创建一个容器叫 JLable
        JLabel backGround=new JLabel(I1);

        //但这个JLable 容器放的背景图片具体好大?放在什么位置,你必须要点名我们要用setBounds

        backGround.setBounds(40,40,508,560);




       //然后我们把这个添加到隐藏容器界面中间
        this.getContentPane().add(backGround);







       // this.add(jLabel);//,如果你不用setLayout 取消默认化,这里默认是放在正中间的

       //我们开始设置添加图片的位置即可,运用到的方法是 setBounds,然后我们直接在JLable 对象创建的 jLable去用这个setbounds即可
        //好现在我们开始把图片添加到指定的位置,是通过坐标的方式去添加的,但我们要先取消默认化,不然它还是添加在正中间
        //这个坐标的原点在左上角

       // jLabel.setBounds(0,0,105,105);

        //这里我们取消默认放置的方法是 setLayout(null),我们已经在initFrame初始化的时候就已经添加了

        //对了,我们添加指定图片的时候是把图片放在界面的隐藏容器的,我们要使用 getContentPane()



        //最后还要重新刷新绘制一下,就是立马让他 重新绘制
        this.getContentPane().repaint();

    }

    //初始化菜单栏
    private void initJMenuBar() {
        //好现在我们在这里设置菜单栏那些
        //就是菜单栏是 JMenuBar
        //然后在菜单栏中肯定有些栏目 这个叫JMenu //比如选项  关于我们
        //然后你点了那些栏目中间的内容后会出现 其他内容比如点了选项 会出现 重新开始 类似的,用的是 JMenuItem
        //我们可以先创建对象然后 把内容往上加

        //先创建一个菜单栏
        JMenuBar jmenubar=new JMenuBar();

        //然后往菜单栏中加内容 比如选项 关于我们

        JMenu choice=new JMenu("选项");
        JMenu aboutOurs=new JMenu("关于我");
        JMenu changeImage=new JMenu("更换图片");


        //然后我开始把写好的内容 往菜单栏中加
        //先加选项里面的
        choice.add(restartGame);
        choice.add(resatrtLogin);
        choice.add(exitGame);
        choice.add(changeImage);

        //这里的大体思路是这样的 把选项和关于我放在菜单栏(JMenuBar)中
        //然后JMenu的选项放在里面菜单栏去,然后在设置一个JMenu的更换图片放在里面去
        //因为JMenu里面有许多JMenuItem

        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);



        //然后加关于我们
        aboutOurs.add(publicArtical);

        //把选项和关于我们 放入栏目中
        jmenubar.add(choice);
        jmenubar.add(aboutOurs);


        restartGame.addActionListener(this);
        resatrtLogin.addActionListener(this);
        exitGame.addActionListener(this);

        publicArtical.addActionListener(this);

        //然后在给 girl ,animal,和sport 加几个动作监听事件

        girl.addActionListener(this);
        sport.addActionListener(this);
        animal.addActionListener(this);




        //最后把写好的栏目放在,界面中间,利用的是 this.setJMenuBar,把写好的jmenubar放在这里面即可


        this.setJMenuBar(jmenubar);
    }


    //初始化菜单
    private void initFrame() {
        /*
    //一:界面搭建
    //1.创建一个完整 游戏主界面,需要 用java 中的 JFrame 这个类,然后要先创建对象
    JFrame gameframe=new JFrame();
    //这个 JFrame的对象名字是 gameframe,然后我利用这个gameframe去调用 setSize 并设置它的高和宽(height和width)
    //width设置为603个像素,height为680个像素
        gameframe.setSize(603,680);
    //最后我们还要把设置好的界面框架,进行展现,调用 setVisible,(true)代表可以展现,(false)则代表不可以展现
        gameframe.setVisible(true);//此时我们的游戏框架界面就搭建好了
    */



        //利用setSize去设置width和height
        //这里的this代表我调用者的地址,也就是我创建对象的地址,这里创建对象创建在APP中间
        this.setSize(603,680);

        //设置界面的标题
        this.setTitle("拼图单机版 v:1.0");

        //让界面始终处于置顶的状态,参数传入是true
        this.setAlwaysOnTop(true);

        //然后让界面处于居中的状态
        this.setLocationRelativeTo(null);

        //设置默认关闭操作方法
        //0:DO_NOTHING_ON_CLOSE
        //1:HIDE_ON_CLOSE
        //2.DISPOSE_ON_CLOSE
        //3:EXIT_ON_CLOSE
        this.setDefaultCloseOperation(3);



        //这里是取消隐藏容器中的默认居中的默认方式
        this.setLayout(null);

        //我们是给整个游戏界面添加一个监听事件,意思是我在这个界面
        // 当中发生上下左右移动的时候就会触发相关动作反应

        this.addKeyListener(this);


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
          //给拼图图片添加一个按a 常见 效果
        int  code = e.getKeyCode();
        if(code==65){
             //这里它每次进来都要先对原来的先清理,因为后加载的永远在后面,不然你永远也见不到
            this.getContentPane().removeAll();

            JLabel j=new JLabel(new ImageIcon(path+"all.jpg"));

            //容器设置坐标 位置 边框
            j.setBounds(83,134,420,420);

            //添加到界面中间
            this.getContentPane().add(j);

            //添加背景图片
            //然后接下来我们 为照片添加背景图,这有个注意事项,先加载的照片会放在最上面,后加载的会放在下面,
            // 所以我们要在添加完拼图图片后,在往下面添加背景图片
            ImageIcon I1=new ImageIcon("D:\\自己写的小程序\\image\\background.png");

            //然后我们这里创建一个容器叫 JLable
            JLabel backGround=new JLabel(I1);

            //但这个JLable 容器放的背景图片具体好大?放在什么位置,你必须要点名我们要用setBounds

            backGround.setBounds(40,40,508,560);

            this.getContentPane().add(backGround); //这里其实只是类似装入了购物车

           //最后这里我们还要刷新一下(就是把购物车的商品 立马下单,如果你不这样,也可以等等 一起 用setVisible 但不可行,因为我马上就要把图片加载完,然后下单)
            this.getContentPane().repaint();


        }




    }

    @Override
    public void keyReleased(KeyEvent e) {
        //这里我们可以这样写, 如果一旦胜利,那么直接返回,这样你胜利后你怎么按键也没有用了
        if(victory()){
            return ;
        }


        //左:37,上:38,右:39,下:40;
       int code=e.getKeyCode();
       if(code==37){
           step++;
           System.out.println("向左移动");

           if(y==3){
               return;
           }
           arrdata[x][y]=arrdata[x][y+1];
           arrdata[x][y+1]=0;
           y++;
           initImage();

       }
       else if(code==38){
           step++;
           System.out.println("向上移动");
           //向上移动的本质就是把空白部分下面的图片和空白部分进行交换
           //我这里只是把图片数据写好,最后还是要重新加载图片才行的

           if(x==3){
               return ;
           }
           arrdata[x][y]= arrdata[x+1][y];
           arrdata[x+1][y]=0;

           //x始终对应的是空白0处
           x=x+1;
           //再次调用初始化图片
           initImage();
       }
       else if(code==39){
           step++;
           System.out.println("向右移动");
           if(y==0){
               return;
           }
           //单纯的交换即可
            arrdata[x][y]=arrdata[x][y-1];
            arrdata[x][y-1]=0;
            y--;
           initImage();

       }
       else if (code==40){
              step++;
           System.out.println("向下移动");
           if(x==0){
               return ;
           }
           arrdata[x][y]=arrdata[x-1][y];
           arrdata[x-1][y]=0;
           x--;
           initImage();
       }

       //这里还要写个判别机制,就是只有我长按a才显示完整图片,松开就不显示了
     else if(code==65)
       {
           initImage();
       }


      //这里我们在写个作弊码
     else if(code==45){

         arrdata=new int [][]{

                 {1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12},
                 {13,14,15,16}

           };
       }

     initImage();
    }

    //这里在写个胜利方法
    public boolean victory(){
        for (int i = 0; i < arrdata.length; i++) {
            for (int j = 0; j < arrdata[i].length; j++) {
                if (arrdata[i][j]!=win[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //利用的是 getSorce去接收 然后判别,统一的父类Object去接收

        Object O=e.getSource();
        if(O== restartGame){
            int step=0;
            initData();
            initImage();
        }
        else if(O==resatrtLogin){
            //关闭当前界面
            this.setVisible(false);
            //重新加载登录界面
            new LoginJFrame();
            System.out.println("重新登录");
        }
       else if(O==exitGame){
            System.out.println("退出游戏");
            //0:程序正常退出,没有异常
            System.exit(0);
        }

       else if(O==publicArtical){
            System.out.println("关于我");

            //创建一个弹框对象
            JDialog jDialog=new JDialog();
            //创建一个容器去管理对象
            JLabel jLabel=new JLabel(new ImageIcon("D:\\自己写的小程序\\image\\sport\\IMG_1695(20260320-195930).PNG"));

            //设置容器宽高和大小
             jLabel.setBounds(0,0,1000,1000);

             //将图片添加到弹框中去
            jDialog.getContentPane().add(jLabel);

            //设置弹框的大小
            jDialog.setSize(550,1200);

            //让弹框置顶
            jDialog.setAlwaysOnTop(true);

            //让弹框处于屏幕中间
            jDialog.setLocationRelativeTo(null);

           //弹框不关闭就无法操作下面的界面
            jDialog.setModal(true);

            //最后直接让弹框展现
            jDialog.setVisible(true);
        }
      else if(O==girl){
          System.out.println("美女图片");

          step=0;
          initData();
          Random SC=new Random();
          int num= SC.nextInt(13)+1;

          //最后面要加分格符 来把他们隔开
          path="D:\\自己写的小程序\\image\\girl\\girl"+num+"\\";

          initImage();
      }

      else if(O==animal)
        {
            step=0;
            initData();
            Random SC=new Random();
            int num= SC.nextInt(8)+1;

            //最后面要加分格符 来把他们隔开
            path="D:\\自己写的小程序\\image\\animal\\animal"+num+"\\";

            initImage();
        }
      else if(O==sport){
            step=0;
            initData();
            Random SC=new Random();
            int num= SC.nextInt(10)+1;

            //最后面要加分格符 来把他们隔开
            path="D:\\自己写的小程序\\image\\sport\\sport"+num+"\\";

            initImage();


        }
    }
}
