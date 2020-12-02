package homework4.first_part.catalog_model;

public enum Type {
    C("Clothing"),
    S("Shoes"),
    A("Accessory");

    private final String name;

    Type(String name) {
        this.name = name;
    }
}
