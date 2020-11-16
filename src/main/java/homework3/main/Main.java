package homework3.main;

import homework3.model.*;
import java.util.*;

public class Main {

    public static void main(String... args) {
        Employee employee1 = new Employee("Pop Marius", 34, 12000);
        Employee employee2 = new Employee("Zbona Lenuta", 26, 10000);
        Employee employee3 = new Employee("Risco Alexandra", 26, 6000);

        Set<Employee> employees = new TreeSet<>(Person::compareTo);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        for (Employee employee : employees) {
            System.out.println(employee.toString() + "\n");
        }

        //System.out.println(employees.size());

        Student student1 = new Student("Zbona Ionut", 17, StudentType.COLLEGE);
        student1.addCourse("Algebra");
        student1.addCourse("Basics of programming");

        Student student2 = new Student("Zbona Ionut", 15, StudentType.SECONDARY);
        student2.addCourse("Mathematical analysis");
        student2.addCourse("Object oriented programming");

        Set<Student> students = new TreeSet<>(Comparator.comparing(Student::getName));

        students.add(student1);
        students.add(student2);

        for (Student student : students) {
            System.out.println(student.toString() + "\n");
        }

        //System.out.println(students.size());

        Country country1 = new Country("United States", "Washington D.C.", 328_200_000);
        Address address1 = new Address("Hope", 1, "Florida City", "Florida", "13243546", country1);
        Address address2 = new Address("Rose", 54, "Florida City", "Florida", "4546576", country1);

        Hobby hobby1 = new Hobby("Football", 10);
        hobby1.addAddress(address1);

        List<Hobby> hobbies1 = new ArrayList<>();

        hobbies1.add(hobby1);

        Hobby hobby2 = new Hobby("Tennis", 2);
        hobby2.addAddress(address1);
        hobby2.addAddress(address2);

        List<Hobby> hobbies2 = new ArrayList<>();
        hobbies2.add(hobby1);
        hobbies2.add(hobby2);

        Map<Person, List<Hobby>> people = new HashMap<>();

        people.put(employee1, hobbies1);
        people.put(employee2, hobbies2);

        for (Map.Entry<Person, List<Hobby>> entry : people.entrySet()) {
            System.out.println("*** " + entry.getKey().toString() + ", has the following hobbies: ");
            List<Hobby> hobbyList = entry.getValue();
            for (Hobby hobby : hobbyList) {
                System.out.println(hobby.toString() + "\n");
            }
        }
    }
}
