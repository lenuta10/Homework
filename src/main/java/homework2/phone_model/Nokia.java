package homework2.phone_model;

public class Nokia extends Phone{

    public boolean isSmartphone;

    public Nokia(String name, String color, String material, boolean isSmartphone){
        super(name, color, material);
        this.isSmartphone = isSmartphone;
    }
}
