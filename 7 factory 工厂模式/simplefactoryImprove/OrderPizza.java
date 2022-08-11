package factory.simplefactoryImprove;

import factory.simplefactory.CheesePizza;
import factory.simplefactory.GreekPizza;
import factory.simplefactory.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //����һ���򵥹�������
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
      setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = ""; //���û�����
        this.simpleFactory = simpleFactory;

        while(true){
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            if(pizza != null) {//�������������
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                ;
                pizza.box();
            }
            else{
                System.out.println("�޸���������");
                break;
            }
        }
    }

    //дһ�����������Ի�ȡ�ͻ�ϣ����������������
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
