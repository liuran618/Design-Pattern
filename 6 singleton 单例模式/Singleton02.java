package singleton;

public class Singleton02 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance == instance2); //instance �� instance2 ָ��ĵ�ַ��һ���ģ���ͬһ����̬ʵ����
    }
}

//����ģʽ ����ʽ����̬���룩(�뾲̬����������ͬ)
/*����ģʽ
	ָ����һ���ķ�������֤���������ϵͳ�У���ĳ����ֻ�ܴ���һ������ʵ�������Ҹ���ֻ�ṩһ��ȡ�������ʵ���ķ�����

�ŵ㣺д���򵥣�����װ�ص�ʱ�򣬾������ʵ�������������߳�ͬ�������⡣
ȱ�㣺����װ�أ���������෽��ʵ����װ�أ���ʱ������ʵ������û�дﵽ Lazy Loading ��Ч��������δʹ�ù����ʵ�����ͻ�����ڴ���˷ѡ�

 ���ۣ����ֵ���ģʽ���ã�����������ڴ��˷ѡ�
 */
class Singleton2{

    //2.������˽�л����޷�ֱ��new
    private Singleton2(){

    }

    //2.�����ڲ���������ʵ��
    private static Singleton2 instance;
    static{//�ھ�̬������У�������������
        instance = new Singleton2();
    }

    //3.�ṩһ�����еľ�̬����������ʵ������
    public static Singleton2 getInstance(){
        return instance;
    }
}