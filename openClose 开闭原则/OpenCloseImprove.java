package OpenClose;

public class OpenCloseImprove {

    public static void main(String[] args) {
        GraphicEditor1 g = new GraphicEditor1();
        g.drawShape(new Rectangle1());
        g.drawShape(new Circle1());
    }
}
/*
改进思路：把创建的 Shape类 做成抽象类，并提供一个抽象的 draw 方法，让子类去实现，
    这样当我们有新的图形种类时，只需要让新的图形类继承 Shape，并实现 draw 方法即可。
该代码实现了开闭原则，当我们需要绘制新的图形时，只需要新增一个类，而不需要修改 GraphicEditor类（使用方）
 */
//这是一个用于绘图的类[使用方]
class GraphicEditor1{
    //接收 Shape 对象，用来绘制不同的图形
    public void drawShape(Shape1 s){
        s.draw();
    }
}

//基类
abstract class Shape1{
    int m_type;

    public abstract void draw();//抽象方法
}

class Rectangle1 extends Shape1{
    @Override
    public void draw(){
        System.out.println("矩形");
    }
}

class Circle1 extends Shape1{
    @Override
    public void draw(){
        System.out.println("圆形");
    }
}