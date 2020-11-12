package homework2.phone_model;

public class NokiaC extends Phone{

    private int numberOfTypeC;

    public NokiaC(String name, String color, String material, int numberOfTypeC){
        super(name, color, material);
        this.numberOfTypeC = numberOfTypeC;
    }
}
