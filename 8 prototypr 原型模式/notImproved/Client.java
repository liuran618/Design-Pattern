package prototype.notImproved;

//��ͳ����,������ֻ��
/*
ȱ�㣺1.�ڴ����µĶ���ʱ��������Ҫ���»�ȡԭʼ��������ԣ��������Ķ����Ϊ���ӣ���Ч�ʵ�
     2.������Ҫ���³�ʼ�����󣬶����Ƕ�̬�ػ�ö�������ʱ��״̬���������

 �Ľ�˼·���� Java �У�Object�� ʱ������ĸ���,Object�� �ṩ��һ�� clone() ����
 �÷������Խ�һ�� Java �����ƣ������Ǵ���һ�����и�����������ʱ�����Ǳ���ʵ�� Cloneable
 �ӿڣ���ԭ��ģʽ��
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep =  new Sheep("showen",1,"��ɫ");
        Sheep sheep2 = new  Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    }
}
