package factory.simplefactoryImprove;

import factory.simplefactory.CheesePizza;
import factory.simplefactory.GreekPizza;
import factory.simplefactory.Pizza;

//简单工厂类
public class SimpleFactory {

    //根据 orderType 返回对应的 pizza 对象
    public Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");

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
