package builder.notImprove;

/*
缺点：这种方法，把产品（即房子）和创建产品的过程（即建房子流程）封装在一起，耦合性过强
解决方案：将产品和产品建造过程解耦 => 建造者模式
 */
public abstract class AbstractHouse {
    //打地基
    public abstract  void buildBasic();

    //砌墙
    public abstract  void buildWalls();

    //封顶
    public abstract  void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
