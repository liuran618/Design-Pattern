package prototype.improve;

public class client {
    public static void main(String[] args) {
        System.out.println("使用原型模式完成对象的克隆");
        Sheep sheep = new Sheep("showen",1,"白色");
        Sheep sheep2 = (Sheep)sheep.clone();
        System.out.println(sheep.toString());
        System.out.println(sheep2.toString());
    }
}
