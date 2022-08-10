package singleton;

public class Singleton06 {
    public static void main(String[] args) {
    Singleton6 instance = Singleton6.getInstance();
    Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance == instance2); //instance �� instance2 ָ��ĵ�ַ��һ���ģ���ͬһ����̬ʵ����
        System.out.println("instance.hashCode = "+instance.hashCode());
        System.out.println("instance2.hashCode = "+instance2.hashCode());//hashCode ��һ����
}
}

//����ģʽ ����ʽ(�̰߳�ȫ,ʹ�þ�̬�ڲ���ķ���)
/*
1.��������صĻ��ƣ���֤��ʼ��ʵ��ʱֻ��һ���̡߳�
2.��̬�ڲ����� Singleton�� ��װ��ʱ����������ʵ��������ֻ���ڵ��� getInstance ����ʱ���Ż�װ�� SingleInstance �࣬�Ӷ���� Singleton ��ʵ������
3.��ľ�̬����ֻ���ڵ�һ�μ������ʱ���ʼ������ JVM �������Ǳ�֤���̵߳İ�ȫ�ԣ�������г�ʼ��ʱ������߳����޷�����ġ�

    �ŵ㣺ʵ���� Lazy Loading ��Ч����������̲߳���ȫ�����⣬ͬʱ���þ�̬�ڲ����ص�ʵ�����ӳټ��أ���֤��Ч��
���ۣ���ʵ�ʿ����У��Ƽ�ʹ�ø÷�����
 */
class Singleton6 {
    private static volatile Singleton6 instance;//volatile:���ѱ�������Ϊvolatile���ͺ󣬱�����������ʱ����ע�⵽��������ǹ���ģ���˲��Ὣ�ñ����ϵĲ����������ڴ����һ��������volatile�������ᱻ�����ڼĴ������߶��������������ɼ��ĵط�������ڶ�ȡvolatile���͵ı���ʱ�ܻ᷵������д���ֵ��

    private Singleton6(){

    }

    //дһ����̬�ڲ��࣬��������һ����̬���� Singleton
    //�������ʱ�����ᵼ�¸þ�̬�ڲ�����أ�ʵ�� Lazy Loading
    private static class SingletonInstance{
        private static final  Singleton6 INSTANCE = new Singleton6();
    }

    //�ṩһ����̬�Ĺ��з�����ֱ�ӷ��� INSTANCE
    public static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE; //���������е��ô�ʱ����ʼװ�� SingletonInstance�࣬����JVMװ�����ԣ����̰߳�ȫ��
    }
}
