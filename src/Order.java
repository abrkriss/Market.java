public class Order {
    private int number;
    public Status status;

    public Order(int number){
        this.number = number;
        this.status = Status.New;
    }

    public int getNumber() {
        return number;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Заказы в магазине "+
             "Номер заказа " + number+ ", Статус заказа " + status;
    }
}
