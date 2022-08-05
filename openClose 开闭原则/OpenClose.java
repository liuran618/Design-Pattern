package OpenClose;

public class OpenClose {
    public static void main(String[] args) {
    GraphicEditor g = new GraphicEditor();
    g.drawShape(new Rectangle());
    g.drawShape(new Circle());
    }
}
/*
该代码简单易懂
但是它违反了设计模式的开闭原则，即对扩展（提供方）开放，对修改（使用方）关闭，
即当我们需要给类增加新功能时，尽量不改代码，或少改代码，
而若我们想增加一个绘制三角形功能时，需要修改很多地方
 */


//这是一个用于绘图的类[使用方]
class GraphicEditor{
    //接收 Shape 对象，用来绘制不同的图形
    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle(s);
        }
        else if(s.m_type == 2){
            drawCircle(s);
        }
    }

    private void drawRectangle(Shape r){
        System.out.println("矩形");
    }

    private void drawCircle(Shape r){
        System.out.println("圆形");
    }
}

//基类
class Shape{
    int m_type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}