package builder.improve;

//����Ľ�����
public abstract class HouseBuilder {
    protected House house = new House();

    //�����������д�ã�����ķ���
    public abstract void buildFoundation();
    public abstract void buildWalls();
    public abstract void roofed();

    //���ӽ��ú󣬽���Ʒ�����ӣ�����
    public House buildHouse(){
        return house;
    }
}
