package homework4.first_part.catalog_model;

import homework4.first_part.catalog_interface.ICatalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements ICatalog {
    private String name;
    private List<Item> items;

    public Catalog(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }

    @Deprecated
    public void listItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
