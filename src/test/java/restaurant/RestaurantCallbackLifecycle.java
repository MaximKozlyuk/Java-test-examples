package restaurant;

import org.junit.jupiter.api.extension.*;

public class RestaurantCallbackLifecycle implements BeforeAllCallback, AfterAllCallback,
        BeforeEachCallback, AfterEachCallback {

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("After Each from AfterEachCallback Extension");
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("Before Each from BeforeEachCallback Extension");
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("After All from AfterAllCallback Extension");
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("Before All from BeforeAllCallback Extension");
    }
}
