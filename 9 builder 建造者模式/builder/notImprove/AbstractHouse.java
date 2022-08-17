package builder.notImprove;

/*
ȱ�㣺���ַ������Ѳ�Ʒ�������ӣ��ʹ�����Ʒ�Ĺ��̣������������̣���װ��һ������Թ�ǿ
�������������Ʒ�Ͳ�Ʒ������̽��� => ������ģʽ
 */
public abstract class AbstractHouse {
    //��ػ�
    public abstract  void buildBasic();

    //��ǽ
    public abstract  void buildWalls();

    //�ⶥ
    public abstract  void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
