package factory.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    //定义一个抽象方法，让各个工厂子类自己实现
    abstract  Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购的 pizza 类型

        while (true) {
            orderType = getType();
            pizza = createPizza(orderType);//抽象方法，由工厂子类实现

            if (pizza != null) {//输入的披萨存在
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
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
