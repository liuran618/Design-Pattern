package factory.abstractfactory;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("北京的奶酪披萨，准备原材料");
    }
}
