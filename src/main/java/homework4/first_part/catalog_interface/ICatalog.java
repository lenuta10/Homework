package homework4.first_part.catalog_interface;

import homework4.first_part.catalog_model.Item;

public interface ICatalog {

    /*
     *
     * The method adds an item into the items list
     *
     */
    void addItem(Item book);

    /*
     *
     * The method deletes an item from the items list
     *
     */
    void deleteItem(Item book);

    /*
     *
     * The method prints the list of items on the console.
     *
     */
    @Deprecated
    void listItems();
}
