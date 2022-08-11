package factory.simplefactoryImprove;

import factory.simplefactory.CheesePizza;
import factory.simplefactory.GreekPizza;
import factory.simplefactory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
      setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = ""; //由用户输入
        this.simpleFactory = simpleFactory;

        while(true){
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            if(pizza != null) {//输入的披萨存在
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                ;
                pizza.box();
            }
            else{
                System.out.println("无该种类披萨");
                break;
            }
        }
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input the kind of pizza:");
            String str =strin.readLine();
            return str;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
