package factory.factorymethod;

public class NJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("NJPepperPizza");
        System.out.println("�Ͼ��ĺ���������׼��ԭ����");
    }
}

