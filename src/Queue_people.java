import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_people implements I_QueueBehavior{
    Deque<People> pq = new ArrayDeque<>();

    @Override
    public void addPeople(People people) {
        pq.add(people);
    }

    @Override
    public void remove_people(People people) {
        pq.remove(people);
    }

    @Override
    public String toString() {
        return "Список покупателей" +
                pq ;
    }
}
