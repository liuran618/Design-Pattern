package segregation;
/*
	改进方案：将Interface1中的方法分解成三个接口Interface1、Interface2、Interface3，分别实现方法1，23，45。
            类C继承interface1，interface2，类D继承interface1，interface3，实现接口隔离原则。
*/
public class segregationImprove {
    public static void main(String[] args) {
        AImprove a = new AImprove();
        a.depend1(new BImprove());//A 类通过接口去依赖 B 类
        a.depend2(new BImprove());
        a.depend3(new BImprove());

        CImprove c = new CImprove();//C 类通过接口依赖 D 类
        c.depend1(new DImprove());
        c.depend4(new DImprove());
        c.depend5(new DImprove());
    }
}
//接口
interface Interface1Improve{
    void operation1();
}
interface Interface2Improve{
    void operation2();
    void operation3();
}
interface Interface3Improve{
    void operation4();
    void operation5();
}

class BImprove implements Interface1Improve,Interface2Improve{
    public void operation1(){
        System.out.println("B 实现了 operation1");
    }

    public void operation2(){
        System.out.println("B 实现了 operation2");
    }

    public void operation3(){
        System.out.println("B 实现了 operation3");
    }
}

class DImprove implements Interface1Improve,Interface3Improve{
    public void operation1(){
        System.out.println("D 实现了 operation1");
    }

    public void operation4(){
        System.out.println("D 实现了 operation4");
    }

    public void operation5(){
        System.out.println("D 实现了 operation5");
    }
}

class AImprove{ //A 类通过接口Interface1 依赖（使用）B 类，但只会用到 1，2，3 这三个方法
    public void depend1(Interface1Improve i){
        i.operation1();
    }
    public void depend2(Interface2Improve i){
        i.operation2();
    }
    public void depend3(Interface2Improve i){
        i.operation3();
    }
}

class CImprove { //C 类通过接口Interface1 依赖（使用）D 类，但只会用到 1，4，5 这三个方法
    public void depend1(Interface1Improve i){
        i.operation1();
    }
    public void depend4(Interface3Improve i){
        i.operation4();
    }
    public void depend5(Interface3Improve i){
        i.operation5();
    }
}