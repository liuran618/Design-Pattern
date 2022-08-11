package factory.factorymethod;

/*
��ͳ����
    �ŵ㣺������⣬�����򵥡�
    ȱ�㣺Υ�������ģʽ�� ocp ԭ�򣬼�����չ���ţ����޸Ĺرգ������Ǹ��������µĹ���ʱ���������޸ģ������޸Ĵ��룩

    �Ľ�˼·�������� Pizza ��ѡ�ĸ���װ��һ�����У��������������µ� Pizza ����ʱ��ֻ��Ҫ�޸ĸ��༴�ɣ��򵥹���ģʽ����
 */

//�� Pizza�� ���ɳ�����
public abstract class Pizza {
    protected String name;

    //ʵ��ԭ�ϵ�׼������ͬ����׼����ʽ��ͬ������ǳ��󷽷�
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking");
    }

    public void cut(){
        System.out.println(name + " cutting");
    }

    public void box(){
        System.out.println(name + " boxing");
    }

    public void setName(String name){
        this.name = name;
    }
}
