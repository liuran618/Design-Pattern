package singleton;

public class Singleton04 {
    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance == instance2); //instance �� instance2 ָ��ĵ�ַ��һ���ģ���ͬһ����̬ʵ����
        System.out.println("instance.hashCode = "+instance.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());//hashCode ��һ����
    }
}

//����ģʽ ����ʽ(�̰߳�ȫ,ʹ��ͬ������)
/*
    �ŵ㣺ʵ���� Lazy Loading ��Ч����������̲߳���ȫ������
    ȱ�㣺Ч�ʵ��£�ÿ���߳�����Ҫ������ʵ���ǣ���ִ�� getInstance() ����ʱ����Ҫ����ͬ������ʵ���ϸ÷���ֻ��Ҫִ��
һ�μ��ɣ�������Ҫ��ø�ʵ��ʱֱ��return���ɡ�
���ۣ���ʵ�ʿ����У����Ƽ�ʹ�ø÷�����
 */
class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){

    }

    //�ṩһ����̬�Ĺ��з���������ͬ������Ĵ��룬����̰߳�ȫ���⣬��ʹ�õ��÷���ʱ����ȥ���� instance
    public static synchronized Singleton4 getInstance(){//synchronized:java��ÿ��������һ��������������synchronized�ؼ������η���ʱ���������ᱣ�������������ڵ��ø÷���ǰ����Ҫ���������������ʹ�������״̬��
        if(instance == null){                           //ͬ����һ�ָ߿����Ĳ��������Ӧ�þ�������ͬ�������ݣ�ʹ��synchronized�����ͬ���ؼ����뼴�ɡ�
            instance = new Singleton4();
        }
        return instance;
    }
}
