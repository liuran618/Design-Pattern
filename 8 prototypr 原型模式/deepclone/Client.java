package prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name  = "�ν�";
        p.deepCloneableTarget = new DeepCloneableTarget("��ʱ��","ˮ䰴���");

        //ʹ�÷���һ������
        DeepProtoType p2 = (DeepProtoType) p.clone();

        //ʹ�÷�ʽ��������
        DeepProtoType p3 = (DeepProtoType)p.deepClone();

        //�ɴ�ӡ�����ÿ�ι�ϣֵ��ͬ����֪ʵ�������
        System.out.println("p.name = "+p.name + " p.deepCloneableTarget = "+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name = "+p2.name + " p2.deepCloneableTarget = "+p2.deepCloneableTarget.hashCode());
        System.out.println("p3.name = "+p3.name + " p3.deepCloneableTarget = "+p3.deepCloneableTarget.hashCode());
    }
}
