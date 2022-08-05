package OpenClose;

public class OpenClose {
    public static void main(String[] args) {
    GraphicEditor g = new GraphicEditor();
    g.drawShape(new Rectangle());
    g.drawShape(new Circle());
    }
}
/*
�ô�����׶�
������Υ�������ģʽ�Ŀ���ԭ�򣬼�����չ���ṩ�������ţ����޸ģ�ʹ�÷����رգ�
����������Ҫ���������¹���ʱ���������Ĵ��룬���ٸĴ��룬
��������������һ�����������ι���ʱ����Ҫ�޸ĺܶ�ط�
 */


//����һ�����ڻ�ͼ����[ʹ�÷�]
class GraphicEditor{
    //���� Shape �����������Ʋ�ͬ��ͼ��
    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle(s);
        }
        else if(s.m_type == 2){
            drawCircle(s);
        }
    }

    private void drawRectangle(Shape r){
        System.out.println("����");
    }

    private void drawCircle(Shape r){
        System.out.println("Բ��");
    }
}

//����
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