package builder.improve;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildFoundation() {
        System.out.println("��¥��ػ�");
    }

    @Override
    public void buildWalls() {
        System.out.println("��¥��ǽ");
    }

    @Override
    public void roofed() {
        System.out.println("��¥���ݶ�");
    }
}
