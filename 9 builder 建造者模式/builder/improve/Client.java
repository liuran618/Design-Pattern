package builder.improve;

public class Client {
    public static void main(String[] args) {
        //����ͨ����
        CommonHouse commonHouse = new CommonHouse();
        //׼���������ӵ�ָ����
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //��ɸǷ��ӣ����ز�Ʒ�����ӣ�
        House house = houseDirector.constructHouse();
        System.out.println("------------------------");

        //�Ǹ�¥
        HighBuilding highBuilding = new HighBuilding();
        //���ý�����
        houseDirector.setHouseBuilder(highBuilding);
        houseDirector.constructHouse();
    }

}
