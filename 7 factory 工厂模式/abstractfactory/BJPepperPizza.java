package factory.abstractfactory;


public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("北京的胡椒披萨，准备原材料");
    }
}
