package inversion;

public class DependencyInversion {
    public static void main(String[] args) {
    Person1 person = new Person1();
    person.receive(new Email1());
    }
}

class Email1{
    public String getInfo(){
        return "电子邮件信息：hello world";
    }
}

/*
Person类 实现接收消息
分析：我们现在只实现了获取电子邮件信息，若我们获取的对象是 微信，短信等信息，则需要新增类，同时 Person类 也要增加相应的方法
解决思路：引入一个抽象的接口 IReceiver，这样 Person类 就与接口 IReceiver 发生依赖，
而因为 Email，weixin 等等属于接收的范围，他们各自实现 IReceiver 的接口就行，从而实现依赖倒转原则
 */
class Person1{
    public void receive(Email1 email){
        System.out.println(email.getInfo());
    }
}
