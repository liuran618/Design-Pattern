package singleton;

public class Singleton07 {

}
//单例模式 枚举
/*
    优点：使用枚举实现单例模式，不仅可以避免多线程同步的问题，还能防止反序列化重新创建新的对象
结论：推荐使用
 */
enum Singleton7{
    INSTANCE;
    public void sayOK(){
        System.out.println("it's ok.");
    }
}