package 文字版格斗游戏2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;


    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};



    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };


    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };





    //男生就从男生的描述词汇中选一个,女生一样
    //卡住了**?


    public Role(){
    }

    public Role(String name,int blood,char gender){
        this.name=name;
        this.blood=blood;
        this.gender=gender;
        setFace(gender);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;


    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {

           int a=boyfaces.length;
           Random SC=new Random();
           int index= SC.nextInt(a);
        if(gender=='男'){
            this.face=boyfaces[index];
        }
        else if(gender=='女'){
            this.face=girlfaces[index];
        }
        else{
            this.face="不论不类,面目全非";
        }
    }


    //定义一个攻击函数
    //r1调用r2,r1攻击r2
    //每次随机扣 0-20的血
    public void attack(Role r){
        Random sc=new Random();
        int hurt =sc.nextInt(20)+1;
        int remainblood =r.getBlood()-hurt;
        remainblood = remainblood<0?0:remainblood;

        if(remainblood>90){
            System.out.printf("%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",this.name,r.name);
            System.out.println();
            System.out.printf("结果%s退了半步，毫发无损",r.name);
        }
        if(remainblood>80&&remainblood<=90){
            System.out.printf("%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s",this.name,r.name);
            System.out.println();
            System.out.printf("结果给%s造成一处瘀伤",r.name);
        }
        if (remainblood>70&&remainblood<=80) {
            System.out.printf("%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿", this.name, r.name);
            System.out.println();
            System.out.printf("结果一击命中，%s痛得弯下腰",r.name);
        }
        if(remainblood>50&&remainblood<=70) {
            System.out.printf("%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。", this.name, r.name);
            System.out.println();
            System.out.printf("结果%s痛苦地闷哼了一声，显然受了点内伤",r.name);
        }
        if(remainblood<=50&&remainblood>30){
            System.out.printf("%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",this.name,r.name);
            System.out.println();
            System.out.printf("结果%s摇摇晃晃，一跤摔倒在地",r.name);
        }
        else {
            System.out.printf("%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s.", this.name, r.name);
            System.out.println();
            System.out.printf("结果%s一声惨叫，像滩软泥般塌了下去",r.name);
        }

        //System.out.println(r.getName()+"受到"+this.getName()+"的攻击还剩余"+r.getBlood()+"的血量");//这里名字怎么写?
        //this 本质上就是调用者的 直接用this***
        r.setBlood(remainblood);
    }

    public void shows(){
        System.out.println("名字是"+this.getName());
        System.out.println("血量是"+this.getBlood());
        System.out.println("性别是"+this.getGender());
        System.out.println("颜值是"+this.getFace());
    }


}


