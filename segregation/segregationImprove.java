package segregation;
/*
	�Ľ���������Interface1�еķ����ֽ�������ӿ�Interface1��Interface2��Interface3���ֱ�ʵ�ַ���1��23��45��
            ��C�̳�interface1��interface2����D�̳�interface1��interface3��ʵ�ֽӿڸ���ԭ��
*/
public class segregationImprove {
    public static void main(String[] args) {
        AImprove a = new AImprove();
        a.depend1(new BImprove());//A ��ͨ���ӿ�ȥ���� B ��
        a.depend2(new BImprove());
        a.depend3(new BImprove());

        CImprove c = new CImprove();//C ��ͨ���ӿ����� D ��
        c.depend1(new DImprove());
        c.depend4(new DImprove());
        c.depend5(new DImprove());
    }
}
//�ӿ�
interface Interface1Improve{
    void operation1();
}
interface Interface2Improve{
    void operation2();
    void operation3();
}
interface Interface3Improve{
    void operation4();
    void operation5();
}

class BImprove implements Interface1Improve,Interface2Improve{
    public void operation1(){
        System.out.println("B ʵ���� operation1");
    }

    public void operation2(){
        System.out.println("B ʵ���� operation2");
    }

    public void operation3(){
        System.out.println("B ʵ���� operation3");
    }
}

class DImprove implements Interface1Improve,Interface3Improve{
    public void operation1(){
        System.out.println("D ʵ���� operation1");
    }

    public void operation4(){
        System.out.println("D ʵ���� operation4");
    }

    public void operation5(){
        System.out.println("D ʵ���� operation5");
    }
}

class AImprove{ //A ��ͨ���ӿ�Interface1 ������ʹ�ã�B �࣬��ֻ���õ� 1��2��3 ����������
    public void depend1(Interface1Improve i){
        i.operation1();
    }
    public void depend2(Interface2Improve i){
        i.operation2();
    }
    public void depend3(Interface2Improve i){
        i.operation3();
    }
}

class CImprove { //C ��ͨ���ӿ�Interface1 ������ʹ�ã�D �࣬��ֻ���õ� 1��4��5 ����������
    public void depend1(Interface1Improve i){
        i.operation1();
    }
    public void depend4(Interface3Improve i){
        i.operation4();
    }
    public void depend5(Interface3Improve i){
        i.operation5();
    }
}