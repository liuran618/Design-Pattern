package singleton;

public class Singleton06 {
    public static void main(String[] args) {
    Singleton6 instance = Singleton6.getInstance();
    Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance == instance2); //instance 与 instance2 指向的地址是一样的，是同一个静态实例。
        System.out.println("instance.hashCode = "+instance.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());//hashCode 是一样的
}
}

//单例模式 懒汉式(线程安全,使用静态内部类的方法)
/*
1.采用类加载的机制，保证初始化实例时只有一个线程。
2.静态内部类在 Singleton类 被装载时并不会立即实例化，而只有在调用 getInstance 方法时，才会装载 SingleInstance 类，从而完成 Singleton 的实例化。
3.类的静态属性只会在第一次加载类的时候初始化，而 JVM 帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。

    优点：实现了 Lazy Loading 的效果，解决了线程不安全的问题，同时利用静态内部类特点实现了延迟加载，保证了效率
结论：在实际开发中，推荐使用该方法。
 */
class Singleton6 {
    private static volatile Singleton6 instance;//volatile:当把变量声明为volatile类型后，编译器与运行时都会注意到这个变量是共享的，因此不会将该变量上的操作与其他内存操作一起重排序。volatile变量不会被缓存在寄存器或者对其他处理器不可见的地方，因此在读取volatile类型的变量时总会返回最新写入的值。

    private Singleton6(){

    }

    //写一个静态内部类，该类中有一个静态属性 Singleton
    //在类加载时，不会导致该静态内部类加载，实现 Lazy Loading
    private static class SingletonInstance{
        private static final  Singleton6 INSTANCE = new Singleton6();
    }

    //提供一个静态的公有方法，直接返回 INSTANCE
    public static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE; //当程序运行到该处时，开始装载 SingletonInstance类，由于JVM装载特性，是线程安全的
    }
}
