import java.util.function.Function;

public class BuilderDemo {
    public static void main(String[] args) {
        // https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegBurger = mealBuilder.prepareVegBurger();
        Meal chickenBurger = mealBuilder.prepareChickenBurger();

        vegBurger.showItems();
        System.out.println("Total Cost: " + vegBurger.getCost());

        System.out.println();
        chickenBurger.showItems();
        System.out.println("Total Cost: " + chickenBurger.getCost());
    }
}