package builder.improve;
//ָ���ߣ���̬��ָ���������̣����ؾ����Ʒ
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //���������� houseBuilder
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //ͨ�� setter �������� houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    //��δ����췿�ӵ����̣� ����ָ����
    public House constructHouse(){
        houseBuilder.buildFoundation();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
