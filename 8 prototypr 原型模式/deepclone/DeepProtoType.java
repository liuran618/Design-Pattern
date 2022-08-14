package prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;//��������
    public DeepProtoType(){
        super();
    }

    //���������һ ʹ�� clone ����
    //ȱ�㣺����Ҫ��¡���������ͽ϶�ʱ��д�����Ƚ��鷳
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep  = super.clone(); //��ɶԻ����������͵Ŀ�¡

        //���������͵����Խ��е�������
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();

        return deepProtoType;
    }

    //��� ������ ͨ���������л�ʵ�֣��Ƽ���
    //  �����л�����һ�ְѶ����״̬ת�����ֽ����Ļ��ƣ��������С������෴�Ĺ��̣������л��ɵ��ֽ����������ڴ������´���һ��ʵ�ʵ�Java����
    public Object deepClone(){
        //����������
        ByteArrayOutputStream bos = null;
        ObjectOutput oos = null;
        ByteArrayInputStream bis = null;
        ObjectInput  ois = null;

        try{
            //���л�
            bos = new ByteArrayOutputStream();//�����ַ������
            oos = new ObjectOutputStream(bos);//���ֽ��������ת���ɶ��������
            oos.writeObject(this);//����ǰ��������Զ������ķ�ʽ���

            //�����л�
            bis = new ByteArrayInputStream(bos.toByteArray());//ʹ�ö���ķ�ʽ���������¡
            ois = new ObjectInputStream(bis);
            DeepProtoType copyeObj = (DeepProtoType) ois.readObject();

            return copyeObj;
        }catch (Exception e){
            e.printStackTrace();;
            return null;
        }finally{
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
