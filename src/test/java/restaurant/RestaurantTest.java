package restaurant;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import testexplore.restaurant.Order;
import testexplore.restaurant.Restaurant;

import java.util.ArrayList;

@RunWith(JUnit4.class)
class RestaurantTest {

    private Restaurant restaurant;

    @BeforeEach
    public void before() {
        restaurant = new Restaurant();
    }

    @AfterEach
    public void after() {}

    @Test
    public void addOrderTest() {
        Assert.assertTrue(
                "Possible to add order",
                restaurant.addOrder(
                        new Order(1, new ArrayList<>())
                )
        );
    }

    @Test
    public void serveOrderTest() {
        Assert.assertNull("When no orders - return null", restaurant.serveOrder());
    }

}