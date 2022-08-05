package liskov;

public class liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("3-2 =" +a.func1(3,2));
        B b = new B();
        System.out.println("3-2 =" +b.func1(3,2));
    }
}
/*
���Ƿ���ԭ���������е�������ܷ����˴���ԭ���� B�� �������д�˸��෽������ɴ���
��ʵ�ʱ���У����ǳ�����ͨ����д���෽��������µĹ��ܣ�����д��Ȼ�򵥣����ᵼ�������̳���ϵ�ĸ����Խϲ�

�����������ԭ���ĸ��������࣬�̳�һ�����ӻ����Ļ��࣬��ԭ�еļ̳й�ϵȥ��
 */

//����һ�����ӻ����Ļ���
class Base{
    //�Ѹ��ӻ����ķ������Աд�� Base�� ��
}

class A{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends A{
    public int func1(int a,int b){ //�˴���д�˸���� func1 ����
        return a+b;                //������д����������ʶ�ģ�������������Ϊ�书�ܺ͸���һ���������
    }
}

//�޸ĺ�� A��
class A1 extends Base{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

//�޸ĺ�� B��
class B1 extends Base{
    //�� B ��Ҫʹ�� A�� �ķ�����ʹ����Ϲ�ϵ
    //��ʱ B ���ټ̳� A�࣬��˵���ʱ���Ǿͻ����ȷ
    private A1 a = new A1();
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}
