package singleton;

public class Singleton05 {
    public static void main(String[] args) {
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance == instance2); //instance �� instance2 ָ��ĵ�ַ��һ���ģ���ͬһ����̬ʵ����
        System.out.println("instance.hashCode = "+instance.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());//hashCode ��һ����
    }
}

//����ģʽ ����ʽ(�̰߳�ȫ,ʹ��˫�ؼ��ķ���)
/*
    �ŵ㣺ʵ���� Lazy Loading ��Ч����������̲߳���ȫ�����⣬ͬʱ��֤��Ч��
���ۣ���ʵ�ʿ����У��Ƽ�ʹ�ø÷�����
 */
class Singleton5 {
    private static volatile Singleton5 instance;//volatile:���ѱ�������Ϊvolatile���ͺ󣬱�����������ʱ����ע�⵽��������ǹ���ģ���˲��Ὣ�ñ����ϵĲ����������ڴ����һ��������volatile�������ᱻ�����ڼĴ������߶��������������ɼ��ĵط�������ڶ�ȡvolatile���͵ı���ʱ�ܻ᷵������д���ֵ��

    private Singleton5(){

    }

    //�ṩһ����̬�Ĺ��з���������˫�ؼ�飨�������� if(single == null) ���жϣ��Ĵ��룬����̰߳�ȫ���⣬ͬʱ���Ч�ʣ���ʹ�õ��÷���ʱ����ȥ���� instance
    public static Singleton5 getInstance() {//synchronized:java��ÿ��������һ��������������synchronized�ؼ������η���ʱ���������ᱣ�������������ڵ��ø÷���ǰ����Ҫ���������������ʹ�������״̬��
        if (instance == null) {              //ͬ����һ�ָ߿����Ĳ��������Ӧ�þ�������ͬ�������ݣ�ʹ��synchronized�����ͬ���ؼ����뼴�ɡ�
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
            return instance;
    }
}
