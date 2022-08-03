package inversion;

public class DependencyInversion {
    public static void main(String[] args) {
    Person1 person = new Person1();
    person.receive(new Email1());
    }
}

class Email1{
    public String getInfo(){
        return "�����ʼ���Ϣ��hello world";
    }
}

/*
Person�� ʵ�ֽ�����Ϣ
��������������ֻʵ���˻�ȡ�����ʼ���Ϣ�������ǻ�ȡ�Ķ����� ΢�ţ����ŵ���Ϣ������Ҫ�����࣬ͬʱ Person�� ҲҪ������Ӧ�ķ���
���˼·������һ������Ľӿ� IReceiver������ Person�� ����ӿ� IReceiver ����������
����Ϊ Email��weixin �ȵ����ڽ��յķ�Χ�����Ǹ���ʵ�� IReceiver �Ľӿھ��У��Ӷ�ʵ��������תԭ��
 */
class Person1{
    public void receive(Email1 email){
        System.out.println(email.getInfo());
    }
}
