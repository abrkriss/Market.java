//реализовывать методы из интерфейса QueueBehaviour, которые имитируют работу очереди.
//        Кроме того, класс должен содержать методы, соответствующие интерфейсу MarketBehaviour,
//        которые добавляют и удаляют людей из очереди, а также метод update, который обновляет
//        состояние магазина путем принятия и отдачи заказов.


public interface I_QueueBehavior {

    void addPeople(People people);

    void remove_people(People people);


}



