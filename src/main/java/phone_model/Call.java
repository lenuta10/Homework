package phone_model;

import java.util.Date;

public class Call {

    private String number;
    private Date date;

    public Call(String number) {
        this.number = number;
        this.date = new Date();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Call{" +
                "number='" + number + '\'' +
                ", date=" + date +
                '}';
    }
}
