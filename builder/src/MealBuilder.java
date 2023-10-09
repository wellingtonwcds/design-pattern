import item.Item;
import item.impl.ChickenBurger;
import item.impl.Coke;
import item.impl.Pepsi;
import item.impl.VegBurger;

public class MealBuilder {
    public Meal prepareChickenBurger(){
        Meal chickenBurger = new Meal();
        chickenBurger.addItem(new ChickenBurger());
        chickenBurger.addItem(new Pepsi());
        return chickenBurger;
    }

    public Meal prepareVegBurger(){
        Meal chickenBurger = new Meal();
        chickenBurger.addItem(new VegBurger());
        chickenBurger.addItem(new Coke());
        return chickenBurger;
    }
}
