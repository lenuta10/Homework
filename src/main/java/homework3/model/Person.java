package homework3.model;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person person) {
        if (this == person) return 0;
        if (person == null) return -1;
        if (this.getAge() < person.getAge())
            return -1;
        else if (this.getAge() > person.getAge())
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "named '" + name + '\'' + ", is " + age + " years old";
    }
}
