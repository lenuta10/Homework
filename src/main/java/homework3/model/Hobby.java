package homework3.model;

import homework3.model.Address;

import java.util.ArrayList;
import java.util.List;

public class Hobby {

    private String name;
    private int frequency;
    private List<Address> addresses;

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = new ArrayList<>();
    }

    @Override
    public String toString() {
        String hobbyToString;
        hobbyToString = "Hobby{" + "name='" + name + '\'' + ", frequency=" + frequency + ", on the addresses  = \n";

        for (Address address : this.addresses) {
            hobbyToString = hobbyToString + address.toString() + "\n";
        }
        hobbyToString = hobbyToString + '}';
        return hobbyToString;
    }

    public void addAddress(Address address) {

        addresses.add(address);
    }
}
