package prototype.improve;

public class client {
    public static void main(String[] args) {
        System.out.println("ʹ��ԭ��ģʽ��ɶ���Ŀ�¡");
        Sheep sheep = new Sheep("showen",1,"��ɫ");
        Sheep sheep2 = (Sheep)sheep.clone();
        System.out.println(sheep.toString());
        System.out.println(sheep2.toString());
    }
}
