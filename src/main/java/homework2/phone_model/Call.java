package homework2.phone_model;

import java.util.Date;

public class Call {

    private String number;
    private Date date;

    public Call(String number) {
        this.number = number;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Call{" + "number='" + number + '\'' + ", date=" + date + '}';
    }
}
