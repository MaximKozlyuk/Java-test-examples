package restaurant;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import testexplore.restaurant.Order;
import testexplore.restaurant.Restaurant;

import java.util.ArrayList;

@RunWith(JUnit4.class)
@ExtendWith({RestaurantExceptions.class, RestaurantCallbackLifecycle.class, SomeSpecialPostProcessing.class})
@TestMethodOrder(MethodOrderer.Random.class)
class RestaurantTest {

    private Restaurant restaurant;

    @BeforeAll
    static void beforeAll() {
        // some heavy calculations
    }

    @AfterAll
    static void afterAll() {

    }

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

    @Test
    public void throwSomethingTest() {
        throw new RuntimeException("Spoiled dish served to client!");
    }

    @Test
    @EnabledIfSystemProperty(named = "restaurantHasAlcoholLicence", matches = "true")
    public void serveVodkaTest() {
        // here only as example
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "restaurantHasAlcoholLicence", matches = "true")
    public void ifEnvIsTest() {
        // here only as example
    }



}