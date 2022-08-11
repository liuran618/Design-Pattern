package factory.factorymethod;

public class NJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
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
