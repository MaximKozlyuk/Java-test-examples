package testexplore;

import testexplore.restaurant.*;

import java.util.List;

class Main {

    public static void main(String[]args){
        System.out.println("Hello from order system!");

        var uOlega = new Restaurant();

        // initializing menu of dishes and ingredients
        var balandaIngr = new Ingredient("Balanda", Spicy.NONE, 1, 5000);
        var vegiesIngr = new Ingredient("Vegetable platter", Spicy.NONE, 1, 5000);
        var shugarIngr = new Ingredient("Sugar", Spicy.NONE, 1, 5000);
        var beefIngr = new Ingredient("Beef", Spicy.NONE, 1, 5000);

        var balanda = new Dish("The Balanda porridge", List.of(balandaIngr, shugarIngr));
        var salad = new Dish("Rich salad", List.of(balandaIngr, vegiesIngr));
        var midlandBeef = new Dish("Roasted midland beef", List.of(balandaIngr, beefIngr, vegiesIngr));

        var order1 = new Order(1, List.of(balanda, midlandBeef));
        var order2 = new Order(2, List.of(balanda, salad));
        var order3 = new Order(3, List.of(midlandBeef));
        var order4 = new Order(4, List.of(salad));

        uOlega.addOrder(order1);
        uOlega.addOrder(order2);
        uOlega.addOrder(order3);
        uOlega.addOrder(order4);


        // actual business-logic
        var currentOrder = uOlega.serveOrder();
        while (currentOrder != null) {
            currentOrder = uOlega.serveOrder();
        }

    }

}
