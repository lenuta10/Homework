package homework5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Person {

    @Getter
    private final String firstName;
    @Getter
    private final String lastName;
    @Getter
    private final int age;
}
