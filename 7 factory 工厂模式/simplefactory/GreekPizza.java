package factory.simplefactory;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare materials for GreekPizza");
    }
}
