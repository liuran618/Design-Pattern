package factory.abstractfactory;

//��������
public class NJFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("ʹ�õ��ǳ��󹤳�ģʽ");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new NJCheesePizza();
        }
        else if(orderType.equals("pepper")){
            pizza = new NJPepperPizza();
        }
        return pizza;
    }
}
