package singleton;

public class Singleton05 {
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance == instance2); //instance 与 instance2 指向的地址是一样的，是同一个静态实例。
        System.out.println("instance.hashCode = "+instance.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());//hashCode 是一样的
    }
}

//单例模式 懒汉式(线程安全,使用双重检查的方法)
/*
    优点：实现了 Lazy Loading 的效果，解决了线程不安全的问题，同时保证了效率
结论：在实际开发中，推荐使用该方法。
 */
class Singleton5 {
    private static volatile Singleton5 instance;//volatile:当把变量声明为volatile类型后，编译器与运行时都会注意到这个变量是共享的，因此不会将该变量上的操作与其他内存操作一起重排序。volatile变量不会被缓存在寄存器或者对其他处理器不可见的地方，因此在读取volatile类型的变量时总会返回最新写入的值。

    private Singleton5(){

    }

    //提供一个静态的公有方法，加入双重检查（进行两次 if(single == null) 的判断）的代码，解决线程安全问题，同时提高效率，当使用到该方法时，才去创建 instance
    public static Singleton5 getInstance() {//synchronized:java的每个对象都有一个内置锁，当用synchronized关键字修饰方法时，内置锁会保护整个方法。在调用该方法前，需要获得内置锁，否则就处于阻塞状态。
        if (instance == null) {              //同步是一种高开销的操作，因此应该尽量减少同步的内容，使用synchronized代码块同步关键代码即可。
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
            return instance;
    }
}
