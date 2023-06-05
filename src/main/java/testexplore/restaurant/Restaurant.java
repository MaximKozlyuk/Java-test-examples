package testexplore.restaurant;

import lombok.AllArgsConstructor;

import java.util.ArrayDeque;
import java.util.Queue;

@AllArgsConstructor
public class Restaurant {

    private final Queue<Order> orders = new ArrayDeque<>();
    private final int capacity = 100;

    public boolean addOrder(Order newOrder) {
        if (orders.size() >= capacity) {
            System.out.println("We are out of free tables!");
            return false;
        }
        return orders.add(newOrder);
    }

    public Order serveOrder() {
        var order = orders.poll();
        if (order == null) {
            System.out.println("All orders cooked!");
            return null;
        }
        order.cookDishes();
        System.out.println("Order " + order + " is fully served!");
        return order;
    }

}
