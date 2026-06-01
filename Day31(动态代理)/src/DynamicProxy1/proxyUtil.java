package DynamicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyUtil {
    public static void main(String[] args) {

        /*
         *
         * 方法的作用：
         *    给一个明星的对象，创建一个代理
         *
         * 形参：
         *    被代理的明星对象
         *
         * 返回值：
         *    给明星创建的代理
         *
         *
         * */
    }
        public static star createProxy(BigStar bigStar){

        //这里他妈看着写一大堆,实际上就是接口的多态,无论返回的吴亦凡,还是蔡徐坤,还是面筋哥,他们都实现了Star这个接口都会唱跳
        //然后最后他传过来是什么,比如是蔡徐坤,我就去调用,对应的方法即可
        //就是以前写的 Animal a=new Dog();a.eat-->狗在吃屎
        //            Animal b=new Cat();b.eat-->猫在吃mouse
        //在实现这个Animal的这个接口的情况下,重写了这个吃的这个状态,你传狗这个对象,就是狗吃吃屎,你传猫这个对象就是猫吃鱼,你传人这个对象就是人吃肉

        //然后多态除了接口型的多态,还有继承型的多态
        //Father s=new Son();Father s=new daughter();比如他们都重写了晚上吃什么的方法,你传儿子就是吃汉堡,你传女儿,就是吃鱼

            //现在来看多态就是多种状态,然后这个状态由于对象的不同,表现出来的具体状态也不同,比如狗吃屎,猫吃鱼,都是吃这个接口,儿子要吃汉堡,女儿要吃鱼,都是重写了吃这个方法

        /* java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：
        public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        参数一：用于指定用哪个类加载器，去加载生成的代理类
        参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
        参数三：用来指定生成的代理对象要干什么事情*/


                star s= (star) Proxy.newProxyInstance(proxyUtil.class.getClassLoader()// 参数一：用于指定用哪个类加载器，去加载生成的代理类
                        , new Class[]{star.class}, // 参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
                        new InvocationHandler() {//  参数三：用来指定生成的代理对象要干什么事情*/
                            @Override
                            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                                /*
                                 * 参数一：代理的对象
                                 * 参数二：要运行的方法 sing
                                 * 参数三：调用sing方法时，传递的实参
                                 */
                                if ("sing".equals(method.getName())) {
                                    System.out.println("准备话筒，收钱");
                                } else if ("dance".equals(method.getName())) {
                                    System.out.println("准备场地，收钱");
                                }

                                // 去找大明星开始唱歌或者跳舞
                                // 代码的表现形式：调用大明星里面唱歌或者跳舞的方法
                                return method.invoke(bigStar, args);

                            }
                        });

                return  s;

         }

     }
