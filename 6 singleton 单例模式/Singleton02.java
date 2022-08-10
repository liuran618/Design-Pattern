package singleton;

public class Singleton02 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance == instance2); //instance 与 instance2 指向的地址是一样的，是同一个静态实例。
    }
}

//单例模式 饿汉式（静态代码）(与静态变量基本相同)
/*单例模式
	指采用一定的方法，保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法。

优点：写法简单，在类装载的时候，就完成了实例化，避免了线程同步的问题。
缺点：在类装载（可能有许多方法实现类装载）的时候就完成实例化，没有达到 Lazy Loading 的效果，若从未使用过这个实例，就会造成内存的浪费。

 结论，这种单例模式可用，但可能造成内存浪费。
 */
class Singleton2{

    //2.构造器私有化，无法直接new
    private Singleton2(){

    }

    //2.在类内部创建对象实例
    private static Singleton2 instance;
    static{//在静态代码块中，创建单例对象
        instance = new Singleton2();
    }

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton2 getInstance(){
        return instance;
    }
}