package item.impl;

import item.ColdDrink;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 4.00f;
    }
}
