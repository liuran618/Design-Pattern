package factory.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbstractFactory factory) {
        Pizza pizza = null;
        String orderType = ""; //�û�������������
        this.abstractFactory = factory;

        while (true) {
            orderType = getType();
            pizza = abstractFactory.createPizza(orderType);//���󷽷����ɹ�������ʵ��

            if (pizza != null) {//�������������
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
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
