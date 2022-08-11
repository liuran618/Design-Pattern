package factory.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    //����һ�����󷽷����ø������������Լ�ʵ��
    abstract  Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //������ pizza ����

        while (true) {
            orderType = getType();
            pizza = createPizza(orderType);//���󷽷����ɹ�������ʵ��

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
