package factory.abstractfactory;

public class NJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("NJPepperPizza");
        System.out.println("�Ͼ�������������׼��ԭ����");
    }
}
