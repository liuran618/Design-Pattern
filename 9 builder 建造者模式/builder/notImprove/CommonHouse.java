package builder.notImprove;

import builder.notImprove.AbstractHouse;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("��ͨ���Ӵ�ػ�");
    }

    @Override
    public void buildWalls() {
        System.out.println("��ͨ���Ӵ���ǽ");
    }

    @Override
    public void roofed() {
        System.out.println("��ͨ���ӷⶥ");
    }
}
