package phone_model;

import java.util.ArrayList;

public class SamsungGalaxyS6 extends Samsung{

    private int numberOfGB;

    public SamsungGalaxyS6(String name, String color, int numberOfGB) {
        super(name, color);
        this.numberOfGB = numberOfGB;
    }

    public SamsungGalaxyS6(String name, ArrayList<Contact> contacts, String color, int numberOfGB) {
        super(name, contacts, color);
        this.numberOfGB = numberOfGB;
    }

    public int getNumberOfGB() {
        return numberOfGB;
    }

    public void setNumberOfGB(int numberOfGB) {
        this.numberOfGB = numberOfGB;
    }
}
