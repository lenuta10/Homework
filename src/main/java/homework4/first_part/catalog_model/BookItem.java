package homework4.first_part.catalog_model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class BookItem extends Item {
    private String name;
    private int numberOfPages;
    private String author;

    @Override
    public int identify() {
        return 1;
    }

}
