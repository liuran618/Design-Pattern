package factory.abstractfactory;

public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味披萨
        new OrderPizza(new BJFactory());
        //创建南京口味披萨
        new OrderPizza(new NJFactory());
    }
}
