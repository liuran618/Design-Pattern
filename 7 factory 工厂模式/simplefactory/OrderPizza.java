package factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do{
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("Greek");
            }
            else if(orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("Cheese");
            }
            else{
                break;
            }
            //输出 pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();;
            pizza.box();
        }while(true);
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
