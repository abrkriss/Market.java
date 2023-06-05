
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;


public class Queue_order implements I_MarketBehaviour {
    Queue<Order> oq = new ArrayDeque<>();


    @Override
    public void update(Order order) {

        if (order.status.equals(Status.New)) {
            oq.add(order);
            System.out.println("\n" + oq);
        }
        if (order.status.equals(Status.In_process)) {
            System.out.println("\n" + oq);
        }
            if (order.status.equals(Status.Ready)) {
                oq.remove(order);
                System.out.printf("\n" + "Заказ под номером " + order.getNumber() +" готов и исключен из списка заказов " + oq);

            }
        }
    }

