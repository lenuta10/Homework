package homework2.phone_main;

import homework2.phone_model.Nokia;
import homework2.phone_model.NokiaC;
import homework2.phone_model.SamsungGalaxyS20;
import homework2.phone_model.SamsungGalaxyS6;

public class PhoneMain {

    public static void main(String... args) {
        SamsungGalaxyS6 phone1 = new SamsungGalaxyS6("Samsung Galaxy S6 Edge Plus", "red", "plastic", 128);
        Nokia phone2 = new Nokia("Nokia T3", "black", "glass",true);
        SamsungGalaxyS20 phone3 = new SamsungGalaxyS20("Samsung Galaxy S20 Plus", "white", "glass");
        NokiaC phone4 = new NokiaC("Nokia C2", "red", "plastic", 7);

        phone1.addContact("1", "Vasile", "Pop", "0755589376");
        phone1.addContact("2", "Elena", "Corovei", "0044632771193");

        System.out.println("\n");

        phone2.addContact("1", "Florin", "Socaciu", "0742767269");
        phone2.addContact("2", "Tiberiu", "Ionescu", "0721324554");
        phone2.addContact("3", "Kinga", "Juhos", "0721113433");

        System.out.println("\n");

        phone3.addContact("1", "Lenuta", "Zbona", "0762390123");
        phone4.addContact("1", "Ana", "Pop", "0734261731");

        System.out.println("\n Contacts of phone1:");
        phone1.listContacts();

        System.out.println("\n Contacts of phone2:");
        phone2.listContacts();

        System.out.println("\n Send messages: ");

        phone1.sendMessage(phone1.getContacts().get(0).getPhoneNumber(), "Ana are mere!");
        phone2.sendMessage(phone2.getContacts().get(2).getPhoneNumber(), "Ana a ramas fara mere!");

        System.out.println("\n Messages of phone1:");

        phone1.listMessages();

        System.out.println("\n Make calls: ");

        phone2.call(phone2.getContacts().get(1).getPhoneNumber());
        phone2.call(phone2.getContacts().get(2).getPhoneNumber());

        System.out.println("\n Calls history: ");
        phone2.viewHistory();
    }
}
