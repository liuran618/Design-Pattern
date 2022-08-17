package builder.improve;

//产品 -> Product
public class House {
    private String foundation;//地基
    private String wall;
    private String roofed;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getWall() {
        return wall;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    public String getRoofed() {
        return roofed;
    }
}

