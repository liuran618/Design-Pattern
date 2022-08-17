package builder.improve;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildFoundation() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼盖屋顶");
    }
}
