package restaurant;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class SomeSpecialPostProcessing implements TestInstancePostProcessor {

    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
        if (testInstance instanceof RestaurantTest) {
            System.out.println("Restaurant post-processing for " + context.getDisplayName());
        } else {
            System.out.println("Wrong post processor used");
        }
    }
}
