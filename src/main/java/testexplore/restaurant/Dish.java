package testexplore.restaurant;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Dish {

    private final String name;
    private final List<Ingredient> ingredients;

    public int price() {
        return ingredients.stream()
                .map(i -> i.getPricePerGram() * 100)
                .reduce(0, Integer::sum);
    }

}
