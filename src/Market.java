public class Market {
    public static void main(String[] args) {
        People p1 = new People("Masha");
        People p2 = new People("Sergey");
        People p3 = new People("Ivan");
        Queue_people pq = new Queue_people();
        pq.addPeople(p1);
        pq.addPeople(p2);
        pq.addPeople(p3);
        System.out.println(pq);
        pq.remove_people(p1);
        System.out.println(pq);
        Order o1 = new Order(1);
        Order o2 = new Order(2);
        Order o3 = new Order(3);
        Queue_order oq = new Queue_order();
        oq.update(o1);
        oq.update(o2);
        o2.setStatus(Status.In_process);
        oq.update(o2);
        oq.update(o3);
        o3.setStatus(Status.Ready);
        oq.update(o3);



    }
}
