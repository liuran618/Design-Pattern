package factory.factorymethod;

public class NJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("NJPepperPizza");
        System.out.println("南京的胡椒披萨，准备原材料");
    }
}

