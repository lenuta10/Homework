package phone_model;

import java.util.ArrayList;

public class Samsung extends Phone implements IPhone{

    private String name;
    private String color;
    private ArrayList<Contact> contacts;
    private ArrayList<Call> calls;
    private ArrayList<Message> messages;

    public Samsung(String name, ArrayList<Contact> contacts, String color) {
        this.name = name;
        this.contacts = contacts;
        this.color = color;
    }

    public Samsung(String name, String color) {
        this.name = name;
        this.color = color;
        this.contacts = new ArrayList<>();
        this.calls = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public String getColor() { return color; }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Call> getCalls() {
        return calls;
    }

    public void setCalls(ArrayList<Call> calls) {
        this.calls = calls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
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
