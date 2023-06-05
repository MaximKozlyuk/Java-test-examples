package testexplore.restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public final class Ingredient {
    private final String name;
    private final Spicy spicy;
    private final int pricePerGram;
    @Setter
    private volatile int gramsAvailable;
}
