package homework2.phone_model;

public abstract class AbstractPhone {

    public abstract void sendMessage(String number, String text);

    public abstract void listMessages();

    public abstract void addContact(String id, String firstName, String lastName, String number);

    public abstract void listContacts();
}
