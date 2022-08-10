package singleton;

public class Singleton04 {
    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance == instance2); //instance 与 instance2 指向的地址是一样的，是同一个静态实例。
        System.out.println("instance.hashCode = "+instance.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());//hashCode 是一样的
    }
}

//单例模式 懒汉式(线程安全,使用同步方法)
/*
    优点：实现了 Lazy Loading 的效果，解决了线程不安全的问题
    缺点：效率低下，每个线程在想要获得类的实例是，在执行 getInstance() 方法时都需要进行同步，而实际上该方法只需要执行
一次即可，后面想要获得该实例时直接return即可。
结论：在实际开发中，不推荐使用该方法。
 */
class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){

    }

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题，当使用到该方法时，才去创建 instance
    public static synchronized Singleton4 getInstance(){//synchronized:java的每个对象都有一个内置锁，当用synchronized关键字修饰方法时，内置锁会保护整个方法。在调用该方法前，需要获得内置锁，否则就处于阻塞状态。
        if(instance == null){                           //同步是一种高开销的操作，因此应该尽量减少同步的内容，使用synchronized代码块同步关键代码即可。
            instance = new Singleton4();
        }
        return instance;
    }
}
