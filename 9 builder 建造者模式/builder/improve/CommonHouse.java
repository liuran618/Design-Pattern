package builder.improve;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildFoundation() {
        System.out.println("��ͨ���Ӵ�ػ�");
    }

    @Override
    public void buildWalls() {
        System.out.println("��ͨ������ǽ");
    }

    @Override
    public void roofed() {
        System.out.println("��ͨ���Ӹ��ݶ�");
    }
}
