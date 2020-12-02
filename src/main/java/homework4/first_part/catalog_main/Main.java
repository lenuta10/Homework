package homework4.first_part.catalog_main;

import homework4.first_part.catalog_interface.ICatalog;
import homework4.first_part.catalog_model.*;

import java.io.*;

public class Main implements java.io.Serializable {

    public static void main(String... args) {

        ICatalog catalog = new Catalog("Book and Sport Items");
        Item item1 = new BookItem("Gone with the Wind", 342, "Margaret Mitchell");
        Item item2 = new SportItem("Red Dress", Type.C);
        Item item3 = new SportItem("Hat", Type.A);
        Item item4 = new BookItem("Steve Jobs", 623, "Walter Isaacson");
        Item item5 = new SportItem("Boots", Type.S);
        Item item6 = new BookItem("Crede-ma cand mint", 251, "Anthony Capella");
        Item item7 = new BookItem("4.50 from Paddington", 256, "Agatha Christie");

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("items.csv"));
            objectOutputStream.writeObject(item1);
            objectOutputStream.writeObject(item2);
            objectOutputStream.writeObject(item3);
            objectOutputStream.writeObject(item4);
            objectOutputStream.writeObject(item5);
            objectOutputStream.writeObject(item6);
            objectOutputStream.writeObject(item7);
            objectOutputStream.flush();
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("items.csv"));

            Item item;
            boolean keepReading = true;

            System.out.println("**** Add item ****");
            try {
                while (keepReading) {
                    item = (Item) objectInputStream.readObject();
                    catalog.addItem(item);

                    System.out.println(item.toString());
                }
            } catch (EOFException e) {
            }

            objectInputStream.close();

            System.out.println("**** Remove an item ****");
            catalog.deleteItem(item1);

            System.out.println("**** List of the remaining items ****");
            catalog.listItems();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
