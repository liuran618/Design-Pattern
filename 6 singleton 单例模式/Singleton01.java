package singleton;

public class Singleton01 {
    public static void main(String[] args) {
    Singleton1 instance = Singleton1.getInstance();
    Singleton1 instance2 = Singleton1.getInstance();
    System.out.println(instance == instance2); //instance �� instance2 ָ��ĵ�ַ��һ���ģ���ͬһ����̬ʵ����
    }
}

//����ģʽ ����ʽ����̬������
/*����ģʽ
	ָ����һ���ķ�������֤���������ϵͳ�У���ĳ����ֻ�ܴ���һ������ʵ�������Ҹ���ֻ�ṩһ��ȡ�������ʵ���ķ�����

�ŵ㣺д���򵥣�����װ�ص�ʱ�򣬾������ʵ�������������߳�ͬ�������⡣
ȱ�㣺����װ�أ���������෽��ʵ����װ�أ���ʱ������ʵ������û�дﵽ Lazy Loading ��Ч��������δʹ�ù����ʵ�����ͻ�����ڴ���˷ѡ�
Lazy Loading��ֻ�е�ʹ�õ����ʵ����ʱ��Żᴴ�����ʵ����

 ���ۣ����ֵ���ģʽ���ã�����������ڴ��˷ѡ�
 */
class Singleton1{

    //1.������˽�л����޷�ֱ��new
    private Singleton1(){

    }

    //2.�����ڲ���������ʵ��
    private final static Singleton1 instance = new Singleton1();

    //3.�ṩһ�����еľ�̬����������ʵ������
    public static Singleton1 getInstance(){
        return instance;
    }
}