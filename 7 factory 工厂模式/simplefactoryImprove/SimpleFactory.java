package factory.simplefactoryImprove;

import factory.simplefactory.CheesePizza;
import factory.simplefactory.GreekPizza;
import factory.simplefactory.Pizza;

//�򵥹�����
public class SimpleFactory {

    //���� orderType ���ض�Ӧ�� pizza ����
    public Pizza createPizza(String orderType){
        System.out.println("ʹ�ü򵥹���ģʽ");

        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("Greek");
        }
        else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("Cheese");
        }

        return pizza;
    }
}
