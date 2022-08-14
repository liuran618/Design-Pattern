package prototype.notImproved;

//传统方法,复制两只羊
/*
缺点：1.在创建新的对象时，总是需要重新获取原始对象的属性，若创建的对象较为复杂，则效率低
     2.总是需要重新初始化对象，而不是动态地获得对象运行时的状态，不够灵活

 改进思路：在 Java 中，Object类 时所有类的根类,Object类 提供了一个 clone() 方法
 该方法可以将一个 Java 对象复制，当我们创建一个具有复制能力的类时，我们必须实现 Cloneable
 接口，即原型模式。
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep =  new Sheep("showen",1,"白色");
        Sheep sheep2 = new  Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    }
}
