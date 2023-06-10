package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    List<OrderItem> items = new ArrayList<>();
    Client client;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double totalPrice() {
        double sum = 0;
        for (OrderItem i : items) {
            sum += i.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("product moment: " + sdf.format(this.getMoment()) + "\n");
        sb.append("order status: " + this.getStatus() + "\n");
        sb.append("client: " + this.client + "\n");
        sb.append("order items:\n");
        for (OrderItem i : items) {
            sb.append(i + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", totalPrice()));
        return sb.toString();
    }

}
