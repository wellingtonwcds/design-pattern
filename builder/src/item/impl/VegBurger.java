package item.impl;

import item.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 3.00f;
    }
}
