package testexplore.restaurant;

import jdk.jshell.spi.ExecutionControl;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Order {

    private final long orderNumber;
    private final List<Dish> dishes;

    public void cookDishes() {
        dishes.forEach(d -> {
            System.out.println("Cooking " + d.getName() + ". ");
        });
    }

    public boolean possibleToCook() throws ExecutionControl.NotImplementedException {
        // todo implement me
        throw new ExecutionControl.NotImplementedException("No implementation for now");
    }

}
