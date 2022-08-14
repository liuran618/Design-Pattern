package prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name  = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("及时雨","水浒传类");

        //使用方法一完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.clone();

        //使用方式二完成深拷贝
        DeepProtoType p3 = (DeepProtoType)p.deepClone();

        //由打印结果，每次哈希值不同，可知实现了深拷贝
        System.out.println("p.name = "+p.name + " p.deepCloneableTarget = "+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name = "+p2.name + " p2.deepCloneableTarget = "+p2.deepCloneableTarget.hashCode());
        System.out.println("p3.name = "+p3.name + " p3.deepCloneableTarget = "+p3.deepCloneableTarget.hashCode());
    }
}
