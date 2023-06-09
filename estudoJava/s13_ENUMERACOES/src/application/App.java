package application;

import java.util.Date;

import entities.Order;
import entities_enums.orderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        //criar objeto da classe order
        Order order = new Order(1080, new Date(), orderStatus.PENDING_PAYMENT);
        System.out.println(order);

        //converter de string para enum ou vice versa
        //objeto que recebe esse valor order status
        orderStatus os1 = orderStatus.DELIVERED;

        orderStatus os2 = orderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
