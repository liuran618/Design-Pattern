package factory.abstractfactory;

public class PizzaStore {
    public static void main(String[] args) {
        //����������ζ����
        new OrderPizza(new BJFactory());
        //�����Ͼ���ζ����
        new OrderPizza(new NJFactory());
    }
}
