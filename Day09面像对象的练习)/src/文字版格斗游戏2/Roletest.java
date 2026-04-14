package 文字版格斗游戏2;

public class Roletest {
    public static void main(String[] args) {
        Role r1=new Role("花海蓓",100,'女');
        Role r2=new Role("都自在",100,'男');
      //给出角色的基本信息
       r1.shows();
       r2.shows();

        //r1.show(r1);//传入的是r?直接用this 就不用传2个
        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println("花海蓓KO了都自在");
                break;
            }
            r2.attack(r1);
            if(r2.getBlood()==0){
                System.out.println("都自在KO了花海蓓");
                break;
            }

        }

    }
}
