package homework2.phone_model;

import java.util.ArrayList;

public class SamsungGalaxyS6 extends Phone {

    private int numberOfGB;

    public SamsungGalaxyS6(String name, String color, String material, int numberOfGB) {
        super(name, color, material);
        this.numberOfGB = numberOfGB;
    }

    public SamsungGalaxyS6(String name, ArrayList<Contact> contacts, String color, String material, int numberOfGB) {
        super(name, contacts, color, material);
        this.numberOfGB = numberOfGB;
    }

}
