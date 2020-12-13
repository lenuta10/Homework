package homework5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static List<Person> firstSentence() {

        Person person1 = new Person("Zbona", "Lenuta", 26);
        Person person2 = new Person("Mare", "Cristina", 27);
        Person person3 = new Person("Dron", "Vasile", 29);
        Person person4 = new Person("Sturz", "Ioana", 36);
        Person person5 = new Person("Fernea", "Teodora", 37);

        List<Person> people;

        people = List.of(person1, person2, person3, person4, person5);

        return people;
    }

    public static void secondSentence(List<Person> people) {

        Set<Person> filteredPeople =
                people
                        .stream()
                        .filter(person -> person.getFirstName().startsWith("M"))
                        .filter(person -> person.getFirstName().contains("a") || person.getLastName().contains("a"))
                        .collect(Collectors.toSet());

        filteredPeople.forEach(System.out::println);

    }

    public static Person thirdSentence(List<Person> people) {

        return people
                .stream()
                .min(Comparator.comparingInt(Person::getAge))
                .get();
    }

    public static Set<String> fourthSentence() {
        Random random = new Random();

        Set<String> randomStrings = new HashSet<>();
        for (int j = 0; j < 5; j++) {
            String generatedString = random.ints(10, 48, 122)
                    .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                    .limit(10)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            randomStrings.add(generatedString);
        }

        return randomStrings;
    }

    /*
     *   String are compared in natural order
     *   Natural order meaning lexicographical order
     */
    public static void fifthSentence() {

        Random random2 = new Random();
        int[] integers = random2.ints(new Random().nextInt(100), 0, 100).map(number -> (number * number)).toArray();

        System.out.println("The number of integers is: " + Arrays.stream(integers).count());

        Arrays.stream(integers).forEach(System.out::println);

    }

    public static Map<String, Integer> sixthSentence() {
        Map<String, Integer> familyMembers = new HashMap<>();

        familyMembers.put("Ioan", 27);
        familyMembers.put("Lenuta", 26);
        familyMembers.put("Carla", 1);
        familyMembers.put("David", 1);
        familyMembers.put("Eliza", 2);
        familyMembers.put("Antonia", 6);
        familyMembers.put("Gratiana", 10);
        familyMembers.put("Mihai", 9);
        familyMembers.put("Elena", 2);
        familyMembers.put("Casian", 23);

        return familyMembers;
    }

    public static void seventhSentence(Set<String> randomStrings) {
        randomStrings
                .stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void eighthSentence(List<Person> people) {
        people.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
    }

    public static void ninthSentence(List<Person> people) {
        boolean isFound = people.stream().anyMatch(person -> person.getAge() > 30);

        System.out.println(isFound);
    }

    public static void tenthSentence() {
        Person person1 = new Person("Zbona", "Lenuta", 26);
        Optional<Person> person = Optional.of(person1);
        boolean isPresent = person.filter(person6 -> person6.getFirstName().contains("Z") || person6.getLastName().contains("Z")).isPresent();

        System.out.println(isPresent);

        Person firstPerson = null;

        Optional<Person> optionalPerson = Optional.ofNullable(firstPerson);

        optionalPerson.ifPresent(nullPerson -> System.out.println(nullPerson.getFirstName()));
    }

    public static void eleventhSentence(Set<String> randomStrings) {
        randomStrings
                .stream()
                .sorted(Comparator.comparingInt(String::length))
                .reduce((first, second) -> first)
                .ifPresent(s -> System.out.println("The shortest string is: " + s));
    }

    public static void main(String... args) {

        //1. Write 5 different instances of that object. Add the instances to a list.

        List<Person> people;

        people = firstSentence();

        System.out.println("1. These are the 5 people: ");
        people.forEach(System.out::println);

        //2. Find the elements containing the letter "a" that start with "M" and print them out. Add the instances to a set.

        System.out.println("2. The elements containing the letter \"a\" and that start with \"M\" are: ");
        secondSentence(people);

        //3. Find the "min" using a custom comparing criteria of choice.

        Person youngestPerson = thirdSentence(people);
        System.out.println("3. The youngest person is: " + youngestPerson);

        //4. Generate 5 random Strings and add them to a Set. Find the "max" (while explaining as Javadoc how comparing Strings works)

        /*
         *   String are compared in natural order
         *   Natural order meaning lexicographical order
         */

        Set<String> randomStrings = fourthSentence();

        System.out.println("4. The random strings are:");
        randomStrings.forEach(System.out::println);

        Optional<String> maxString =
                randomStrings
                        .stream()
                        .max(String::compareToIgnoreCase);

        maxString.ifPresent(s -> System.out.println("4.1 Max string is: " + s));


        //5.  Generate a random number of Integers and then count them. "Map" the exponential to the numbers and then print them out.

        System.out.println("5. The random numbers are: ");
        fifthSentence();

        //6.  Create a map of "n" (K,V) elements and print "how many" elements have value over 10 (the key is of your choice)

        Map<String, Integer> familyMembers = sixthSentence();

        System.out.println("6. " + familyMembers.values().stream().filter(number -> number > 10).count() + " family members are over 10 years old!");

        //7. Sort the above Set<String> (used for max) in reverse order

        System.out.println("7. The set of strings sorted in reverse order: ");
        seventhSentence(randomStrings);

        //8. Sort the above List of custom objects (used for filter) in an order you consider

        System.out.println("8. The list of people is sorted by age: ");
        eighthSentence(people);

        //9. Check if any of your instances "match" a condition based on an Integer field (of your choice). What does it return ? Print it out.

        System.out.println("9. If there are people older than 30 years: ");
        ninthSentence(people);

        //10. What does Optional represent ? Explain through an example on your custom object
        //    -> Wrap an existing instance
        //    -> Wrap a null
        //    -> Check value using ifPresent or isPresent

        System.out.println("10. If the person contains \"Z\" in their name: ");
        tenthSentence();

        //11.  Fastest way to find the shortest String in a List (take the 5 random Strings generated above and find the shortest one).

        System.out.println("11. The shortest String in a the List of Strings: ");
        eleventhSentence(randomStrings);
    }

}
