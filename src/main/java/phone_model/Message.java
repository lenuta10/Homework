package phone_model;

public class Message {

    private String number;
    private String text;
    private final static int MAX_NUMBER_OF_CHARACTERS = 500;

    public Message(String number, String text) {
        this.number = number;
        if(text.length() <= MAX_NUMBER_OF_CHARACTERS)
            this.text = text;
        else
            System.out.println("Number of characters should be less then " + MAX_NUMBER_OF_CHARACTERS);
    }

    public String getContact() {
        return number;
    }

    public void setContact(String number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }
}
