package factory.factorymethod;

public class NJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("NJPepperPizza");
        System.out.println("�Ͼ�������������׼��ԭ����");
    }
}
