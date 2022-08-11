package factory.abstractfactory;

//工厂子类
public class NJFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new NJCheesePizza();
        }
        else if(orderType.equals("pepper")){
            pizza = new NJPepperPizza();
        }
        return pizza;
    }
}
