import item.Item;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        return items.stream().map(Item::price).reduce(0f, Float::sum);
    }

    public void showItems(){
        for(Item item: items){
            System.out.print("Item:"+ item.name());
            System.out.print(", Packing:"+ item.packing().pack());
            System.out.println(", Price:"+ item.price());

        }
    }
}
