package inversion;

public class DependencyInversionImprover {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.receive(new Email2());
        person.receive(new Weixin());
    }
}

//定义接口
interface IReceiver{
    public String getInfo();
}

//电子邮件
class Email2 implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：hello world";
    }
}

//微信
class Weixin implements IReceiver{
    public String getInfo(){
        return "微信信息：hello world";
    }

}

class Person2{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
