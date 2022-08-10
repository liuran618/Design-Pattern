package singleton;

public class Singleton03 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance == instance2); //instance 与 instance2 指向的地址是一样的，是同一个静态实例。
        System.out.println("instance.hashCode = "+instance.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());//hashCode 是一样的
    }
}

//单例模式 懒汉式(线程不安全)
/*
    优点：实现了 Lazy Loading 的效果，但是只能在单线程中使用
    缺点：只能在单线程中使用，若在多线程中，一歌线程进入了 if(singleton == null) 的判断语句，还未往下执行语句实例化，
而另一个线程也通过了该判断语句，此时就会产生多个实例。
结论：在实际开发中，不要使用该方法。
 */
class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){

    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}