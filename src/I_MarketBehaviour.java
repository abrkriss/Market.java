//соответствующие интерфейсу MarketBehaviour,
//        которые добавляют и удаляют людей из очереди, а также метод update, который обновляет
//        состояние магазина путем принятия и отдачи заказов.
public interface I_MarketBehaviour {
    void  update(Order order);
}
