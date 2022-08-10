package singleton;

public class Singleton01 {
    public static void main(String[] args) {
    Singleton1 instance = Singleton1.getInstance();
    Singleton1 instance2 = Singleton1.getInstance();
    System.out.println(instance == instance2); //instance 与 instance2 指向的地址是一样的，是同一个静态实例。
    }
}

//单例模式 饿汉式（静态变量）
/*单例模式
	指采用一定的方法，保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法。

优点：写法简单，在类装载的时候，就完成了实例化，避免了线程同步的问题。
缺点：在类装载（可能有许多方法实现类装载）的时候就完成实例化，没有达到 Lazy Loading 的效果，若从未使用过这个实例，就会造成内存的浪费。
Lazy Loading：只有当使用到这个实例的时候才会创建这个实例，

 结论，这种单例模式可用，但可能造成内存浪费。
 */
class Singleton1{

    //1.构造器私有化，无法直接new
    private Singleton1(){

    }

    //2.在类内部创建对象实例
    private final static Singleton1 instance = new Singleton1();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance(){
        return instance;
    }
}