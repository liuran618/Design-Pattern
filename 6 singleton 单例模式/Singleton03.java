package singleton;

public class Singleton03 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance == instance2); //instance �� instance2 ָ��ĵ�ַ��һ���ģ���ͬһ����̬ʵ����
        System.out.println("instance.hashCode = "+instance.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());//hashCode ��һ����
    }
}

//����ģʽ ����ʽ(�̲߳���ȫ)
/*
    �ŵ㣺ʵ���� Lazy Loading ��Ч��������ֻ���ڵ��߳���ʹ��
    ȱ�㣺ֻ���ڵ��߳���ʹ�ã����ڶ��߳��У�һ���߳̽����� if(singleton == null) ���ж���䣬��δ����ִ�����ʵ������
����һ���߳�Ҳͨ���˸��ж���䣬��ʱ�ͻ�������ʵ����
���ۣ���ʵ�ʿ����У���Ҫʹ�ø÷�����
 */
class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){

    }

    //�ṩһ����̬�Ĺ��з�������ʹ�õ��÷���ʱ����ȥ���� instance
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}