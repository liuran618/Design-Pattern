package factory.factorymethod;

/*
传统方法
    优点：易于理解，操作简单。
    缺点：违反了设计模式的 ocp 原则，即对扩展开放，对修改关闭（当我们给类增加新的功能时，尽量不修改，或少修改代码）

    改进思路：将创建 Pizza 对选哪个封装到一个类中，这样当我们有新的 Pizza 种类时，只需要修改该类即可（简单工厂模式）。
 */

//将 Pizza类 做成抽象类
public abstract class Pizza {
    protected String name;

    //实现原料的准备，不同披萨准备方式不同，因此是抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking");
    }

    public void cut(){
        System.out.println(name + " cutting");
    }

    public void box(){
        System.out.println(name + " boxing");
    }

    public void setName(String name){
        this.name = name;
    }
}
