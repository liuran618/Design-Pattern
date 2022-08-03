package inversion;
//���ǶԽӿڴ��ݵ���չ
public class ExtensionAboutInterface {
}

//����1��ͨ���ӿڴ���ʵ������������һ���ӿ��д��룻��һ���ӿ�
interface IOpenAndClose{
    public void open(ITV tv);//���󷽷������ڽ��սӿ�
}
interface ITV{
    public void play();
}

//ʵ�� ITV �ӿ�
class TypeTV implements ITV{

    @Override
    public void play() {
        System.out.println("TypeTV is open");
    }
}

//ͨ���ӿڴ���ʵ������
class OpenAndClose implements IOpenAndClose{
    public void open(ITV tv){
        tv.play();
    }
}

//ͨ������������ʵ����������
interface IOpenAndClose1{
    public void open();//���󷽷������ڽ��սӿ�
}
class openAndClose1 implements  IOpenAndClose1{
    ITV tv;
    public openAndClose1(ITV tv){//�ڹ��췽���д���ӿ�
        this.tv = tv;
    }
    public void open(){
        tv.play();
    }
}

//ͨ��һ������ setter ���ӿڴ���
interface IOpenAndClose2{
    public void open();//���󷽷������ڽ��սӿ�
    public void setter(ITV tv);
}
class openAndClose2 implements  IOpenAndClose1{
    ITV tv;
    public void open(){
        tv.play();
    }
    public void setter(ITV tv){
        this.tv = tv;
    }
}