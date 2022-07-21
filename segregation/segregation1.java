package segregation;

public class segregation1 {
}
/*
�ӿڸ���ԭ��Interface Segregation Principle��
        �ͻ��˲�Ӧ������������Ҫ�Ľӿڣ���һ�������һ���������Ӧ�ý�������С�ӿ��ϡ�
        ��ӿ�Interface1����1��2��3��4��5����������B��Dʵ���˸ýӿڡ���Aͨ���ӿ�������ʹ�ã���C��1��2��3������û���õ�4��5����������C����Ҫʵ�ַ���4��5��
        ͬ����Bͨ���ӿ�������ʹ�ã���D��1��4��5������û���õ�2��3����������D����Ҫʵ�ַ���2��3
*/

//�ӿ�
interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{
    public void operation1(){
        System.out.println("B ʵ���� operation1");
    }

    public void operation2(){
        System.out.println("B ʵ���� operation2");
    }

    public void operation3(){
        System.out.println("B ʵ���� operation.");
    }

    public void operation4(){
        System.out.println("B ʵ���� operation4");
    }

    public void operation5(){
        System.out.println("B ʵ���� operation5");
    }
}

class D implements Interface1{
    public void operation1(){
        System.out.println("D ʵ���� operation1");
    }

    public void operation2(){
        System.out.println("D ʵ���� operation2");
    }

    public void operation3(){
        System.out.println("D ʵ���� operation3");
    }

    public void operation4(){
        System.out.println("D ʵ���� operation4");
    }

    public void operation5(){
        System.out.println("D ʵ���� operation5");
    }
}

class A{ //A ��ͨ���ӿ�Interface1 ������ʹ�ã�B �࣬��ֻ���õ� 1��2��3 ����������
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface1 i){
        i.operation2();
    }
    public void depend3(Interface1 i){
        i.operation3();
    }
}

class C{ //C ��ͨ���ӿ�Interface1 ������ʹ�ã�D �࣬��ֻ���õ� 1��4��5 ����������
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface1 i){
        i.operation4();
    }
    public void depend5(Interface1 i){
        i.operation5();
    }
}