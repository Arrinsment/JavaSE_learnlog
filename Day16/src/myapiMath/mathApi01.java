package myapiMath;

public class mathApi01 {
    public static void main(String[] args) {

        //常见的数学Api(Math,直接在后面调用方法名即可,因为方法全部都是静态的)

        // 一.abs,返回绝对值的类,范围-2147483648~2147483647
        //如果在这个范围类没有正数或者负数与之对应就会报错,比如-2147483648,没有正数与之对应,又或者2147483649
        //如果你具体不清楚可以用 absexeact去判断,没有正数或者负数对应的会报错
        System.out.println(Math.abs(-88));//result:88
        System.out.println(Math.abs(88));//result:88
      //  System.out.println(Math.absExact(-2147483648));//报错

        //二.ceil,天花板,引审过来向上取整(double类型的)
        //向数轴的正方向去取整的
        System.out.println(Math.ceil(12.3));//13.0
        System.out.println(Math.ceil(14.9));//15.0
        System.out.println(Math.ceil(-11.8));//-11.0
        System.out.println(Math.ceil(-9.1));//-9.0

        //三.floor,地板,向下取整的意思
        //向数轴负方向去取整
        System.out.println(Math.floor(15.6));//15.0
        System.out.println(Math.floor(-8.9));//-9.0


        //四.四舍五入,先去掉负号,正常四舍五入,然后加负号即可
        System.out.println(Math.round(12.3));//12
        System.out.println(Math.round(14.9));//15
        System.out.println(Math.round(-11.8));//-12
        System.out.println(Math.round(-9.1));//-9

        //五.获取2个正数的最大值,返回的也是最大值那个
        System.out.println(Math.max(9, 6));

        //六.获取2个正数的最小值,返回的也是最大值那个
        System.out.println(Math.min(3,6));//6

        System.out.println("--------------------------------------------------");
        //七,获取a,b次幂Math.pow(a,b),double
        System.out.println(Math.pow(2, 3));//8.0
        System.out.println(Math.pow(3, 6));//729.0
         //细节1.b是小数,那么就开根号
        System.out.println(Math.pow(4, 0.5));//2.0
         //细节2,b是负数,那么就是a的b次放后然后开根号
        System.out.println(Math.pow(4, -0.5));//-0.5
        //细节3,一般我们的b都是大于等于1的,如果你要开开根号直接用sqrt即可,开立方用cbrt(double类型的)
        System.out.println(Math.sqrt(4));//开根号,结果是2.0
        System.out.println(Math.cbrt(8));//开立方,结果是2.0;
        System.out.println("---------------------------------------------------");
        //这里利用随机数random,[0,1)去获取随机数,虽然我们不这样写,但也要看懂
        for (int i = 0; i < 10; i++) {
            //这样就可以获取 [0,100]的随机数了
            System.out.println(Math.floor(Math.random() * 100 + 1));

        }
    }
}
