package inversion;

public class DependencyInversionImprover {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.receive(new Email2());
        person.receive(new Weixin());
    }
}

//����ӿ�
interface IReceiver{
    public String getInfo();
}

//�����ʼ�
class Email2 implements IReceiver{
    public String getInfo(){
        return "�����ʼ���Ϣ��hello world";
    }
}

//΢��
class Weixin implements IReceiver{
    public String getInfo(){
        return "΢����Ϣ��hello world";
    }

}

class Person2{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
