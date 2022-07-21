package segregation;

public class segregation1 {
}
/*
接口隔离原则（Interface Segregation Principle）
        客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小接口上。
        如接口Interface1具有1，2，3，4，5个方法。类B，D实现了该接口。类A通过接口依赖（使用）类C的1，2，3方法，没有用到4，5方法，但类C仍需要实现方法4，5。
        同理，类B通过接口依赖（使用）类D的1，4，5方法，没有用到2，3方法，但类D仍需要实现方法2，3
*/

//接口
interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{
    public void operation1(){
        System.out.println("B 实现了 operation1");
    }

    public void operation2(){
        System.out.println("B 实现了 operation2");
    }

    public void operation3(){
        System.out.println("B 实现了 operation.");
    }

    public void operation4(){
        System.out.println("B 实现了 operation4");
    }

    public void operation5(){
        System.out.println("B 实现了 operation5");
    }
}

class D implements Interface1{
    public void operation1(){
        System.out.println("D 实现了 operation1");
    }

    public void operation2(){
        System.out.println("D 实现了 operation2");
    }

    public void operation3(){
        System.out.println("D 实现了 operation3");
    }

    public void operation4(){
        System.out.println("D 实现了 operation4");
    }

    public void operation5(){
        System.out.println("D 实现了 operation5");
    }
}

class A{ //A 类通过接口Interface1 依赖（使用）B 类，但只会用到 1，2，3 这三个方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}

class C{ //C 类通过接口Interface1 依赖（使用）D 类，但只会用到 1，4，5 这三个方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}