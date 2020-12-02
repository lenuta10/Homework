package homework4.first_part.catalog_model;

import lombok.Getter;
import lombok.ToString;

@ToString
public class SportItem extends Item{
    @Getter
    private String name;
    @Getter
    private Type type;

    public SportItem(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public int identify() {
        return 2;
    }
}
