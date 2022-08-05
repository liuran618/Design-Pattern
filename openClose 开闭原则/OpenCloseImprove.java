package OpenClose;

public class OpenCloseImprove {

    public static void main(String[] args) {
        GraphicEditor1 g = new GraphicEditor1();
        g.drawShape(new Rectangle1());
        g.drawShape(new Circle1());
    }
}
/*
�Ľ�˼·���Ѵ����� Shape�� ���ɳ����࣬���ṩһ������� draw ������������ȥʵ�֣�
    �������������µ�ͼ������ʱ��ֻ��Ҫ���µ�ͼ����̳� Shape����ʵ�� draw �������ɡ�
�ô���ʵ���˿���ԭ�򣬵�������Ҫ�����µ�ͼ��ʱ��ֻ��Ҫ����һ���࣬������Ҫ�޸� GraphicEditor�ࣨʹ�÷���
 */
//����һ�����ڻ�ͼ����[ʹ�÷�]
class GraphicEditor1{
    //���� Shape �����������Ʋ�ͬ��ͼ��
    public void drawShape(Shape1 s){
        s.draw();
    }
}

//����
abstract class Shape1{
    int m_type;

    public abstract void draw();//���󷽷�
}

class Rectangle1 extends Shape1{
    @Override
    public void draw(){
        System.out.println("����");
    }
}

class Circle1 extends Shape1{
    @Override
    public void draw(){
        System.out.println("Բ��");
    }
}