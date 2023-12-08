package lab7;

import lab7.delivery.Delivery;
import lab7.payment.Payment;
import lombok.Setter;
import lab7.item.Item;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;

    @Setter
    private Payment paymentStrategy;

    @Setter
    private Delivery deliveryStrategy;

    public double calculatePrice() {
        double result = 0;
        for (Item item : items) {
            result += item.price();
        }
        return result;
    }

    public boolean processOrder() {
        if (paymentStrategy.getIsFullyPayed()) {
            System.out.println("Starting the delivery");
            deliveryStrategy.deliver(items);
            return true;
        } else {
            System.out.println("You have to pay for order before we deliver it");
            return false;
        }
    }

    public void addItem(Item item) {
        items.add(item);
        paymentStrategy.setPrice(calculatePrice());
    }

    public void removeItem(Item item) {
        items.remove(item);
        paymentStrategy.setPrice(calculatePrice());
    }
}
