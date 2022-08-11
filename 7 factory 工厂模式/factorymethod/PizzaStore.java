package factory.factorymethod;

public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味披萨
        new BJOrderPizza();
        //创建南京口味披萨
        new NJOrderPizza();
    }
}
