package prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;//引用类型
    public DeepProtoType(){
        super();
    }

    //深拷贝：方法一 使用 clone 方法
    //缺点：当需要克隆的引用类型较多时，写起来比较麻烦
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep  = super.clone(); //完成对基本数据类型的克隆

        //对引用类型的属性进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();

        return deepProtoType;
    }

    //深拷贝 方法二 通过对象序列化实现（推荐）
    //  “序列化”是一种把对象的状态转化成字节流的机制，“反序列”是其相反的过程，把序列化成的字节流用来在内存中重新创建一个实际的Java对象。
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutput oos = null;
        ByteArrayInputStream bis = null;
        ObjectInput  ois = null;

        try{
            //序列化
            bos = new ByteArrayOutputStream();//创建字符输出流
            oos = new ObjectOutputStream(bos);//将字节输出流，转换成对象输出流
            oos.writeObject(this);//将当前这个对象，以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());//使用读入的方式，将对象克隆
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
