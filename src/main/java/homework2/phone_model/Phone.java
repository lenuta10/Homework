package homework2.phone_model;

import homework2.phone_interface.PhoneService;

import java.util.ArrayList;

public class Phone extends AbstractPhone implements PhoneService {

    private String name;
    private String color;
    private final int BATTERY_LIFE;
    private String material;
    private ArrayList<Contact> contacts;
    private ArrayList<Call> calls;
    private ArrayList<Message> messages;

    public Phone(String name, ArrayList<Contact> contacts, String color, String material) {
        this.name = name;
        this.contacts = contacts;
        this.color = color;
        this.BATTERY_LIFE = 24;
        this.material = material;
    }

    public Phone(String name, String color, String material) {
        this.name = name;
        this.color = color;
        this.BATTERY_LIFE = 24;
        this.material = material;
        this.contacts = new ArrayList<>();
        this.calls = new ArrayList<>();
        this.messages = new ArrayList<>();
    }


    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    @Override
    public void sendMessage(String number, String text) {
        Message message = new Message(number, text);
        messages.add(message);
        System.out.println(message.toString() + " was sent");
    }

    @Override
    public void listMessages() {
        for(Message message : messages)
            System.out.println(message.toString() + "\n");
    }

    @Override
    public void addContact(String id, String firstName, String lastName, String number) {
        Contact contact = new Contact(id, firstName, lastName, number);
        contacts.add(contact);
        System.out.println(contact.toString() + " was added");
    }

    @Override
    public void listContacts(){
        for(int i = 0; i < contacts.size(); i++)
            System.out.println(contacts.get(i).toString());
    }

    @Override
    public void call(String number) {
        Call call = new Call(number);
        System.out.println(call.toString() + " just started");
        calls.add(call);
    }

    @Override
    public void viewHistory() {
        for(Call call : calls)
            System.out.println(call.toString() + "\n");
    }

}
