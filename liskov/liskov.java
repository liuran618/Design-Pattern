package liskov;

public class liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("3-2 =" +a.func1(3,2));
        B b = new B();
        System.out.println("3-2 =" +b.func1(3,2));
    }
}
/*
我们发现原来正常运行的相减功能发生了错误，原因是 B类 无意间重写了父类方法，造成错误
在实际编程中，我们常常会通过重写父类方法来完成新的功能，这样写虽然简单，但会导致整个继承体系的复用性较差

解决方案：让原来的父类与子类，继承一个更加基础的基类，将原有的继承关系去掉
 */

//创建一个更加基础的基类
class Base{
    //把更加基础的方法与成员写道 Base类 中
}

class A{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends A{
    public int func1(int a,int b){ //此处重写了父类的 func1 方法
        return a+b;                //这里重写可能是无意识的，但会让人误以为其功能和父类一样，是相减
    }
}

//修改后的 A类
class A1 extends Base{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

//修改后的 B类
class B1 extends Base{
    //若 B 需要使用 A类 的方法，使用组合关系
    //此时 B 不再继承 A类，因此调用时我们就会很明确
    private A1 a = new A1();
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}
