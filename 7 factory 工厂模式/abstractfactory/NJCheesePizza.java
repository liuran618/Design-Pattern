package factory.abstractfactory;

public class NJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("NJPepperPizza");
        System.out.println("南京的奶酪披萨，准备原材料");
    }
}
