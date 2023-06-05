package restaurant;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class RestaurantExceptions implements TestExecutionExceptionHandler {

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        System.out.println(context.getDisplayName());
        System.out.println("Something bad happened at restaurant! " + throwable.getMessage());
    }
}
